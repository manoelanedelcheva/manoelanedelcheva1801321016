package uni.pu.fmi;

/**
 * 
 */
public class Movie {

    /**
     * Default constructor
     */
    public Movie() {
    }

 
    private String movieName;
    private String movieTime;
    private int movieHall;
    private String cinema;
    
    

    public Movie(String movieName, String movieTime, int movieHall, String cinema) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.movieHall = movieHall;
		this.cinema = cinema;
	}


	/**
     * 
     */
    public Reservation reservations;

    /**
     * @return
     */
    public String getMovieName() {
       return movieName;
    }

    /**
     * @param movieName 
     * @return
     */
    public void setMovieName(String movieName) {
    		this.movieName=movieName;
    }

    /**
     * @return
     */
    public String getMovieTime() {
        return movieTime;
    }

    /**
     * @param movieTime 
     * @return
     */
    public void setMovieTime(String movieTime) {
    		this.movieTime=movieTime;
    }

    /**
     * @return
     */
    public int getMovieHall() {
        return movieHall;
    }

    /**
     * @param movieHall 
     * @return
     */
    public void setMovieHall(int movieHall) {
        this.movieHall=movieHall;
    }

    /**
     * @return
     */
    public String getCinema() {
        return cinema;
    }

    /**
     * @param cinema 
     * @return
     */
    public void setCinema(String cinema) {
        this.cinema=cinema;
    }

}