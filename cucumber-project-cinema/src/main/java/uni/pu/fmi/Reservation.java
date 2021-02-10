package uni.pu.fmi;
import java.util.*;


/**
 * 
 */
public class Reservation {

    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */
    private User user;
    private Movie movie;
    private String seatNum;
    private String reservationTime;

    /**
     * 
     */
  
    public Set<Movie> movies;

    /**
     * 
     */
    public Set<User> users;

    /**
     * @return
     */
    public User getUser() {
        return user;
        
    }

    /**
     * @param user 
     * @return
     */
    public void setUser(User user) {
        this.user=user;
    }

    /**
     * @return
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * @param movie 
     * @return
     */
    public void setMovie(Movie movie) {
        this.movie=movie;
    }

  

    /**
     * @return
     */
    public String getSeatNum() {
        return seatNum;
    }

  
    /**
     * @param seatNum 
     * @return
     */
    public void setSeatNum(String seatNum) {
        this.seatNum=seatNum;
    }

    /**
     * @return
     */
    public String getReservationTime() {
        return reservationTime;
    }

    /*
     * @param reservationTime 
     * @return
     */
    
    public void setReservationTime(String reservationTime) {
        this.reservationTime=reservationTime;
}
    
    
     
    
    }
