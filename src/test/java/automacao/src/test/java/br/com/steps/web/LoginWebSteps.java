package automacao.src.test.java.br.com.steps.web;

import br.com.automacao.web.funcionalidade.LoginWebFunctionality;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginWebSteps {
	
	private LoginWebFunctionality loginWebFuncionalidade;
	
	public LoginWebSteps() {
		this.loginWebFuncionalidade = new LoginWebFunctionality();
	}
	

	@Given("^that i'm on the home page$")
	public void thatIMOnTheHomePage(){
		System.out.println("Beginning...");
	}

	@And("^i click on the Sign-On button$")
	public void iClickOnTheSignOnButton(){
		this.loginWebFuncionalidade.clickSignOn();
	}
	
	@And("^i write the correct Username$")
	public void iWriteTheCorrectUsername() {
		this.loginWebFuncionalidade.writesOnInputs();
	}


	@When("^i click on the Sign-In button$")
	public void iClickOnTheSignInButton() {
		this.loginWebFuncionalidade.clickSignIn();
	}


	@Then("^i see the Flight Finder page$")
	public void iSeeTheFlightFinderPage() {
		Assert.assertEquals(true, this.loginWebFuncionalidade.checkImg());
	}

	
}
