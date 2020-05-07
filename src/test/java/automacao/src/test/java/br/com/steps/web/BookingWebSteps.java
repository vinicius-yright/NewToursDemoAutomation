package automacao.src.test.java.br.com.steps.web;

import java.util.NoSuchElementException;

import br.com.automacao.web.funcionalidade.BookingWebFunctionality;
import br.com.automacao.web.funcionalidade.LoginWebFunctionality;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BookingWebSteps {
	
	private BookingWebFunctionality bookingWebFunctionality;
	private LoginWebFunctionality loginWebFunctionality;
	
	public BookingWebSteps() {
		this.bookingWebFunctionality = new BookingWebFunctionality();
		this.loginWebFunctionality = new LoginWebFunctionality();
	}

	@Given("^that i'm on Flight Finder page$")
	public void thatIMOnFlightFinderPage() {
		System.out.println("Starting booking test...");
		this.loginWebFunctionality.clickSignOn();
		this.loginWebFunctionality.writesOnInputs();
		this.loginWebFunctionality.clickSignIn();
	}

	@And("^i choose the trip preferences$")
	public void iChooseTheTripPreferences() {
		try {
			this.bookingWebFunctionality.chooseFlightDetails();
			} catch(NoSuchElementException ex) {
				this.loginWebFunctionality.writesOnInputs();
				this.loginWebFunctionality.clickSignOn();
				ex.printStackTrace();
			}
	}



	@And("^i click on the Continue button$")
	public void iClickOnTheContinueButton() {
		this.bookingWebFunctionality.clickContinue();
		
	}



	@And("^i choose the most expansive options$")
	public void iChooseTheMostExponsiveOptions() {
		this.bookingWebFunctionality.choosePrices();
		
	}



	@And("^i click on the second Continue button$")
	public void iClickOnTheSecondContinueButton() {
		this.bookingWebFunctionality.clickSecondContinue();
	}



	@And("^i fill all the input fields with valid information$")
	public void iFillAllTheInputFieldsWithValidInformation() {
		this.bookingWebFunctionality.passengerAndBillingDetails();
	}



	@When("^i click on the Secure Purchase button$")
	public void iClickOnTheSecurePurchaseButton() {
		this.bookingWebFunctionality.clickSecurePurchase();
	}



	@SuppressWarnings("deprecation")
	@Then("^i see the message \"([^\"]*)\"$")
	public void iSeeTheMessage(String arg1) {
		Assert.assertEquals(arg1, this.bookingWebFunctionality.validation());
	}

}
