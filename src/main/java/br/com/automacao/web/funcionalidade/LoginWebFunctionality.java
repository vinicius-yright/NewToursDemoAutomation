package br.com.automacao.web.funcionalidade;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.LoginWebPage;

public class LoginWebFunctionality extends BaseTest{
	
	private LoginWebPage loginWebPage;
	private RegisterWebFunctionality cadastroWebFunctionality;
	
	public LoginWebFunctionality() {
        this.loginWebPage = new LoginWebPage(webDriver);
        this.cadastroWebFunctionality = new RegisterWebFunctionality();
    }
	
	public void clickSignOn() {
		this.loginWebPage.getBtnSignOn().click();
	}
	
	public void writesOnInputs() {
		this.loginWebPage.getInputUserName().sendKeys("Suiciniv" + this.cadastroWebFunctionality.FixedValue);
		this.loginWebPage.getInputPassword().sendKeys("teste123");
	}
	
	public void clickSignIn() {
		this.loginWebPage.getBtnLogin().click();
	}
	
	public boolean checkImg() {
		return this.loginWebPage.getImgFlightFinder().isDisplayed();
	}
	
	
	

}
