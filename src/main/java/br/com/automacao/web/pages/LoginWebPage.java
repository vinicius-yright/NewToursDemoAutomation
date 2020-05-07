package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage {
	
	public LoginWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
	@FindBy(xpath = "//a[contains(text(),'SIGN-ON')]")
	private WebElement btnSignOn;
	
	@FindBy(xpath = "//input[@name='userName']")
	private WebElement inputUserName;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//img[@src='/images/masts/mast_flightfinder.gif']")
	private WebElement imgFlightFinder;

	public WebElement getImgFlightFinder() {
		return imgFlightFinder;
	}

	public WebElement getBtnSignOn() {
		return btnSignOn;
	}

	public WebElement getInputUserName() {
		return inputUserName;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
