package uni.pu.fmi.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import uni.pu.fmi.Movie;
import uni.pu.fmi.Reservation;
import uni.pu.fmi.User;

public class ReserveService {
	
	static HashMap<String, List<String>> ticketsNum = new HashMap<String, List<String>>();
	private static List<Reservation> reservations = new ArrayList<>();

	public static Object reserve(String firstName, String lastName, String cardNum, String cinema, String movie,String movieTime, String seatNum) {
				
				if(null == firstName || firstName == "") {
					return "Моля, въведете име!";
				}
				if(null == lastName || lastName == "") {
					return "Моля, въведете фамилия!";
				}
				if(null == cardNum || cardNum == "") {
					return "Моля, попълнете номер на дебитна карта!";
				}
				
				
				Optional<Movie> foundMovie = getMovies().stream().filter(m -> m.getMovieName().equals(movie)).findFirst();
				if (!foundMovie.isPresent()) {
					return "Филма не е намерен";
				}
				
				DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
				LocalDateTime requestedTimeAsDate = LocalDateTime.parse(movieTime, formatter);
				LocalDateTime movieTimeAsDate = LocalDateTime.parse(foundMovie.get().getMovieTime(), formatter);
				
				if (requestedTimeAsDate.isBefore(movieTimeAsDate.minusHours(1))) {
					Reservation reservation = new Reservation();
					reservation.setReservationTime(requestedTimeAsDate.format(formatter).toString());
					reservation.setSeatNum(seatNum);
					reservation.setMovie(foundMovie.get());
					
					Optional<User> foundUser = getUsers().stream().filter(u -> u.getFirstName().equals(firstName) && u.getLastName().equals(lastName))
							.findFirst();
					
					if (foundUser.isPresent()) {
						reservation.setUser(foundUser.get());
					} else {
						User user = new User();
						user.setFirstName(firstName);
						user.setLastName(lastName);
						user.setCardNum(cardNum);
						user.getReservations().add(reservation);
					}
					
					reservations.add(reservation);
				} else {
					return "Остават по-малко от 60 минути до началото на прожекцията, не може да запазите места!";
				}
				
				if (ticketsNum.containsKey(movie) && ticketsNum.get(movie).contains(seatNum)) {
					return "Това място вече е заето!";
			} else {
				List<String> places = new ArrayList<String>();
				places.add(seatNum);
				ticketsNum.put(movie, places);
			}
				
			return "Вижда съобщение  за успех.";
		}
	public static List<User> getUsers() {
		User user = new User();
		user.setFirstName("Александра");
		user.setLastName("Стоева");
		user.setCardNum("052698574");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user);
		return users;
	}
	public static List<Movie> getMovies() {
		Movie movie = new Movie();
		movie.setMovieName("Frozen");
		movie.setMovieTime("2021-02-05 12:00");
		movie.setCinema("Cinema City Stara Zagora");
		
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(movie);
		return movies;
	}
}
