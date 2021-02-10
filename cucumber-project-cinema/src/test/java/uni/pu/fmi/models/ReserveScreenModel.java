package uni.pu.fmi.models;

import uni.pu.fmi.services.ReserveService;

public class ReserveScreenModel {
	
	private String firstName;
	private String lastName;
	private String cardNum;
	private String cinema;
	private String movie;
	private String movieTime;
	private String seatNum;
	private Object message;
	
public void navigateToMe() {
	System.out.println("Екрана за резервации е отворен.");
}


public void setName(final String firstName) {
	this.firstName=firstName;
}

public void setLastName(final String lastName){
	this.lastName=lastName;
}

public void setCardNum(final String cardNum){
	this.cardNum=cardNum;
}

public void setCinema(final String cinema) {
	this.cinema=cinema;
}

public void setMovie(final String movie) {
	this.movie=movie;
}

public void setMovieTime(final String movieTime) {
	this.movieTime=movieTime;
}


public void setSeatNum(final String seatNum) {
	this.seatNum=seatNum;
}

public void clickReserveButton() {
	message = ReserveService.reserve(firstName, lastName, cardNum, cinema, movie, movieTime, seatNum);
}

public Object getReserveMessage(){
	return message;
}





}
