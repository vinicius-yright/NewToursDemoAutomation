package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingWebPage {

	public BookingWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
	@FindBy(xpath = "//select[@name='passCount']")
	private WebElement selectPassengers;
	
	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement selectDepartingLocation;
	
	@FindBy(xpath = "//select[@name='fromMonth']")
	private WebElement selectDepartingMonth;
	
	@FindBy(xpath = "//select[@name='fromDay']")
	private WebElement selectDepartingDay;
	
	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement selectDestination;
	
	@FindBy(xpath = "//select[@name='toMonth']")
	private WebElement selectReturningMonth;
	
	@FindBy(xpath = "//select[@name='toDay']")
	private WebElement selectReturningDay;
	
	@FindBy(xpath = "//select[@name='airline']")
	private WebElement selectAirline;
	
	@FindBy(xpath = "//input[@name='findFlights']")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//input[@value='Unified Airlines$363$281$11:24']")
	private WebElement radioBtnDepart;
	
	@FindBy(xpath = "//input[@value='Unified Airlines$633$303$18:44']")
	private WebElement radioBtnReturn;
	
	@FindBy(xpath = "//input[@name='reserveFlights']")
	private WebElement btnContinue2;
	
	@FindBy(xpath = "//input[@name='passFirst0']")
	private WebElement input1PassFirstName;
	
	@FindBy(xpath = "//input[@name='passLast0']")
	private WebElement input1PassLastName;
	
	@FindBy(xpath = "//select[@name='pass.0.meal']")
	private WebElement select1PassMeal;
	
	@FindBy(xpath = "//input[@name='passFirst1']")
	private WebElement input2PassFirstName;
	
	@FindBy(xpath = "//input[@name='passLast1']")
	private WebElement input2PassLastName;
	
	@FindBy(xpath = "//select[@name='pass.1.meal']")
	private WebElement select2PassMeal;
	
	@FindBy(xpath = "//select[@name='creditCard']")
	private WebElement selectCard;
	
	@FindBy(xpath = "//input[@name='creditnumber']")
	private WebElement inputCardNumber;
	
	@FindBy(xpath = "//select[@name='cc_exp_dt_mn']")
	private WebElement selectMonthNumber;
	
	@FindBy(xpath = "//select[@name='cc_exp_dt_yr']")
	private WebElement selectYearNumber;
	
	@FindBy(xpath = "//input[@name='cc_frst_name']")
	private WebElement inputCardOwnerFirstName;
	
	@FindBy(xpath = "//input[@name='cc_mid_name']")
	private WebElement inputCardMiddleName;
	
	@FindBy(xpath = "//input[@name='cc_last_name']")
	private WebElement inputCardLastName;
	
	@FindBy(xpath = "//input[@name='billAddress1']")
	private WebElement inputBillingAddress;
	
	@FindBy(xpath = "//input[@name='billCity']")
	private WebElement inputBillingCity;
	
	@FindBy(xpath = "//input[@name='billState']")
	private WebElement inputBillingState;
	
	@FindBy(xpath = "//input[@name='billZip']")
	private WebElement inputBillingZip;
	
	@FindBy(xpath = "//select[@name='billCountry']")
	private WebElement selectBillingCountry;
	
	@FindBy(xpath = "//font[contains(text(),\"Same as Billing Address\" )] / preceding-sibling :: input[@name='ticketLess']")
	private WebElement selectDeliverySameAsBilling;
	
	@FindBy(xpath = "//input[@name=\"buyFlights\"]")
	private WebElement btnSecurePurchase;
	
	@FindBy(xpath = "//font[contains(text(), \"Your \" )] ")
	private WebElement txtValidation;
	
	public WebElement getSelectPassengers() {
		return selectPassengers;
	}

	public WebElement getSelectDepartingLocation() {
		return selectDepartingLocation;
	}

	public WebElement getSelectDepartingMonth() {
		return selectDepartingMonth;
	}

	public WebElement getSelectDepartingDay() {
		return selectDepartingDay;
	}

	public WebElement getSelectDestination() {
		return selectDestination;
	}

	public WebElement getSelectReturningMonth() {
		return selectReturningMonth;
	}

	public WebElement getSelectReturningDay() {
		return selectReturningDay;
	}

	public WebElement getSelectAirline() {
		return selectAirline;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getRadioBtnDepart() {
		return radioBtnDepart;
	}

	public WebElement getRadioBtnReturn() {
		return radioBtnReturn;
	}

	public WebElement getBtnContinue2() {
		return btnContinue2;
	}

	public WebElement getInput1PassFirstName() {
		return input1PassFirstName;
	}

	public WebElement getInput1PassLastName() {
		return input1PassLastName;
	}

	public WebElement getSelect1PassMeal() {
		return select1PassMeal;
	}

	public WebElement getInput2PassFirstName() {
		return input2PassFirstName;
	}

	public WebElement getInput2PassLastName() {
		return input2PassLastName;
	}

	public WebElement getSelect2PassMeal() {
		return select2PassMeal;
	}

	public WebElement getSelectCard() {
		return selectCard;
	}

	public WebElement getInputCardNumber() {
		return inputCardNumber;
	}

	public WebElement getSelectMonthNumber() {
		return selectMonthNumber;
	}

	public WebElement getSelectYearNumber() {
		return selectYearNumber;
	}

	public WebElement getInputCardOwnerFirstName() {
		return inputCardOwnerFirstName;
	}

	public WebElement getInputCardMiddleName() {
		return inputCardMiddleName;
	}

	public WebElement getInputCardLastName() {
		return inputCardLastName;
	}

	public WebElement getInputBillingAddress() {
		return inputBillingAddress;
	}

	public WebElement getInputBillingCity() {
		return inputBillingCity;
	}

	public WebElement getInputBillingState() {
		return inputBillingState;
	}

	public WebElement getInputBillingZip() {
		return inputBillingZip;
	}

	public WebElement getSelectBillingCountry() {
		return selectBillingCountry;
	}

	public WebElement getSelectDeliverySameAsBilling() {
		return selectDeliverySameAsBilling;
	}

	public WebElement getBtnSecurePurchase() {
		return btnSecurePurchase;
	}

	public WebElement getTxtValidation() {
		return txtValidation;
	}
	
	
}
