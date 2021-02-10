package uni.pu.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pu.fmi.models.ReserveScreenModel;

public class ReserveSteps {
	
	ReserveScreenModel reserveScreen= new ReserveScreenModel();
	
	@Given("^Потребителя отваря страницата за резервации\\.$")
	public void openReserveScreeen() throws Throwable {
	    reserveScreen.navigateToMe();
	    }

	@When("^Въвежда име \"([^\"]*)\"$")
	public void addName(String firstname) throws Throwable {
	    reserveScreen.setName(firstname);   
	}

	@When("^Въвежда фамилия \"([^\"]*)\"$")
	public void addLastName(String lastName) throws Throwable {
	    reserveScreen.setLastName(lastName);
	}

	@When("^Въвежда № на карта \"([^\"]*)\"$")
	public void addCardNum(String cardNum) throws Throwable {
	    reserveScreen.setCardNum(cardNum);
	}

	@When("^Въвежда кино \"([^\"]*)\"$")
	public void addCinema(String cinema) throws Throwable {
	    reserveScreen.setCinema(cinema);
	}

	@When("^Въвежда филм \"([^\"]*)\"$")
	public void addFilm(String movie) throws Throwable {
	    reserveScreen.setMovie(movie);
	}

	@When("^Въвежда прожекция \"([^\"]*)\"$")
	public void addMovieTime(String movieTime) throws Throwable {
	    reserveScreen.setMovieTime(movieTime);
	}

	@When("^Въвежда желано място \"([^\"]*)\"$")
	public void addSeatNum(String seatNum) throws Throwable {
	    reserveScreen.setSeatNum(seatNum);
	}

	@When("^Натиска бутон за потвърждаване на резервация\\.$")
	public void clickReserveButton() throws Throwable {
	    reserveScreen.clickReserveButton();
	}

	@Then("^Вижда съобщение  за успех\\.$")
	public void checkReserveMessage() throws Throwable {
	    assertEquals("Вижда съобщение  за успех.",reserveScreen.getReserveMessage());
	}
	
	@Then("^Моля, въведете име!$")
	public void assertMisingName() throws Throwable {
		assertEquals("Моля, въведете име!",reserveScreen.getReserveMessage());
	}

	@Then("^Моля, въведете фамилия!$")
	public void assertMisingFName() throws Throwable {
		assertEquals("Моля, въведете фамилия!",reserveScreen.getReserveMessage());
	}
	
	@Then("^Моля, попълнете номер на дебитна карта!$")
	public void assertMissingCardNum() throws Throwable {
		assertEquals("Моля, попълнете номер на дебитна карта!",reserveScreen.getReserveMessage());
	}
	
	@Then("^Остават по-малко от 60 минути до началото на прожекцията, не може да запазите места!$")
	public void checkReservationDate() {
		assertEquals("Остават по-малко от 60 минути до началото на прожекцията, не може да запазите места!", reserveScreen.getReserveMessage());
	}
	
	@Then("^Това място вече е заето!$")
	public void unableSeat() throws Throwable {
		assertEquals("Това място вече е заето!",reserveScreen.getReserveMessage());
	}
}
