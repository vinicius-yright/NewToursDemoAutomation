package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroWebPage {
			
	public CadastroWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
//IDS DA 4DEV	
	@FindBy(id = "bt_gerar_pessoa")
	private WebElement btn4GeneratePerson;
	
	@FindBy(id = "nome")
	private WebElement field4Name;
	
	@FindBy(id = "email")
	private WebElement field4Email;
	
	@FindBy(id = "telefone_fixo")
	private WebElement field4Tel;
	
	@FindBy(id = "cep")
	private WebElement field4Cep;
	
	@FindBy(id = "endereco")
	private WebElement field4Address;
	
	@FindBy(id = "numero")
	private WebElement field4Number;
	
	@FindBy(id = "cidade")
	private WebElement field4City;
	
	@FindBy(id = "estado")
	private WebElement field4State;
	
	
//FIM DOS IDS DA 4DEV	
	
	
//XPATHS MERCURY TOURS
	@FindBy(xpath = "//a[contains(text(), 'Register')]")
	private WebElement buttonRegister;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement nameField;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneField;
	
	@FindBy(xpath = "//input[@name='userName']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@name='address1']")
	private WebElement addressField;
	
	@FindBy(xpath = "//input[@name='address2']")
	private WebElement numberField;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement cityField;
	
	@FindBy(xpath = "//input[@name='state']")
	private WebElement stateField;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement postalCodeField;
	
	@FindBy(xpath = "//select[@name='country']")
	private WebElement selectCountry;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement userField;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='register']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//div[contains(text(), '© 2005, Mercury Interactive (v. 011003-1.01-058)')]")
	private WebElement lastText;
	
	public WebElement getLastText() {
		return lastText;
	}

	public WebElement getBtn4GeneratePerson() {
		return btn4GeneratePerson;
	}
	
	public WebElement submitButton() {
		return submitButton;
	}

	public WebElement getField4Email() {
		return field4Email;
	}

	public WebElement getField4Tel() {
		return field4Tel;
	}

	public WebElement getField4Name() {
		return field4Name;
	}

	public WebElement getField4Cep() {
		return field4Cep;
	}
	
	public WebElement getField4Address() {
		return field4Address;
	}
	
	public WebElement getField4Number() {
		return field4Number;
	}

	public WebElement getField4City() {
		return field4City;
	}

	public WebElement getField4State() {
		return field4State;
	}

	public WebElement getNumberField() {
		return numberField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getButtonRegister() {
		return buttonRegister;
	}

	public WebElement getNameField() {
		return nameField;
	}

	public WebElement getPhoneField() {
		return phoneField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getAddressField() {
		return addressField;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public WebElement getStateField() {
		return stateField;
	}

	public WebElement getPostalCodeField() {
		return postalCodeField;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getUserField() {
		return userField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	
}
