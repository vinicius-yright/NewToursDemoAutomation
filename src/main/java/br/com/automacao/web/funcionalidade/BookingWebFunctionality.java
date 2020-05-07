package br.com.automacao.web.funcionalidade;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.BookingWebPage;

public class BookingWebFunctionality extends BaseTest {
	
	private BookingWebPage bookingWebPage;
	
	public BookingWebFunctionality() {
		this.bookingWebPage = new BookingWebPage(webDriver);
	}
	
	public void chooseFlightDetails() {
		Select select0 = new Select(this.bookingWebPage.getSelectPassengers());
		select0.selectByValue("2");
		Select select1 = new Select(this.bookingWebPage.getSelectDepartingLocation());
		Select select2 = new Select(this.bookingWebPage.getSelectDepartingMonth());
		Select select3 = new Select(this.bookingWebPage.getSelectDepartingDay());
		Select select4 = new Select(this.bookingWebPage.getSelectDestination());
		Select select5 = new Select(this.bookingWebPage.getSelectReturningMonth());
		Select select6 = new Select(this.bookingWebPage.getSelectReturningDay());
		Select select7 = new Select(this.bookingWebPage.getSelectAirline());
		
		
		select1.selectByVisibleText("Sydney");
		select2.selectByVisibleText("January");
		select3.selectByValue("18");
		select4.selectByVisibleText("San Francisco");
		select5.selectByVisibleText("February");
		select6.selectByValue("9");
		select7.selectByVisibleText("Unified Airlines");
	}
	
	public void clickContinue() {
		this.bookingWebPage.getBtnContinue().click();;
	}
	
	public void choosePrices() {
		wait.until(ExpectedConditions.elementToBeClickable(this.bookingWebPage.getRadioBtnDepart()));
		this.bookingWebPage.getRadioBtnDepart().click();
		this.bookingWebPage.getRadioBtnReturn().click();
	}
	
	public void clickSecondContinue() {
		this.bookingWebPage.getBtnContinue2().click();
	}
	
	public void passengerAndBillingDetails() {
		this.bookingWebPage.getInput1PassFirstName().sendKeys("Suiciniv");
		this.bookingWebPage.getInput1PassLastName().sendKeys("Otirb");
		this.bookingWebPage.getInput2PassFirstName().sendKeys("Vinicius");
		this.bookingWebPage.getInput2PassLastName().sendKeys("Brito");
		Select selectMeal1 = new Select(this.bookingWebPage.getSelect1PassMeal());
		Select selectMeal2 = new Select(this.bookingWebPage.getSelect2PassMeal());
		selectMeal1.selectByVisibleText("Bland");
		selectMeal2.selectByVisibleText("Hindu");
		Select selectCard = new Select(this.bookingWebPage.getSelectCard());
		selectCard.selectByVisibleText("Visa");
		this.bookingWebPage.getInputCardNumber().sendKeys("5624576532324");
		Select selectExpirationMonth = new Select(this.bookingWebPage.getSelectMonthNumber());
		selectExpirationMonth.selectByVisibleText("06");;
		Select selectExpirationYear = new Select(this.bookingWebPage.getSelectYearNumber());
		selectExpirationYear.selectByValue("2009");
		this.bookingWebPage.getInputCardOwnerFirstName().sendKeys("Sugar");
		this.bookingWebPage.getInputCardMiddleName().sendKeys("K.");
		this.bookingWebPage.getInputCardMiddleName().sendKeys("Daddy");
		this.bookingWebPage.getInputBillingAddress().sendKeys("Rua dos Bobos");
		this.bookingWebPage.getInputBillingCity().sendKeys("Cidade dos otarios");
		this.bookingWebPage.getInputBillingState().sendKeys("Estado Democratico de Direito");
		this.bookingWebPage.getInputBillingZip().sendKeys("09189324");
		Select selectBillingCountry = new Select(this.bookingWebPage.getSelectBillingCountry());
		selectBillingCountry.selectByVisibleText("UNITED STATES");
		this.bookingWebPage.getSelectDeliverySameAsBilling().click();
	}
	
	public void clickSecurePurchase() {
		this.bookingWebPage.getBtnSecurePurchase().click();
	}
	
	public String validation() {
		return this.bookingWebPage.getTxtValidation().getText();
	}
	
}
