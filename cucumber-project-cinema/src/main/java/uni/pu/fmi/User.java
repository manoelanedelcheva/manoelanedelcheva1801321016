package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {    }

    private String firstName;
    private String lastName;
    private String cardNum;
    private Set<Reservation> reservations=new HashSet<Reservation>();

    public User(String firstName, String lastName, String cardNum, Set<Reservation> reservations) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNum = cardNum;
		this.reservations = reservations;
	}

	/**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
      this.firstName=firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    /**
     * @return
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * @param cardNum 
     * @return
     */
    public void setCardNum(String cardNum) {
      this.cardNum=cardNum;
    }

    /**
     * @return
     */
    public Set<Reservation> getReservations() {
 
        return reservations;
    }

    /**
     * @param reservation not NUUll instance of {@link Set}
     */
    public void setReservations(Set<Reservation> reservation) {
    	this.reservations = reservation;
    }
    
    public void addReservation(Reservation reservation) {
      reservations.add(reservation);
 }

}