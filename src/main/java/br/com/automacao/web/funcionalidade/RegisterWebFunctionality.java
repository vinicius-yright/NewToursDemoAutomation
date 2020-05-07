package br.com.automacao.web.funcionalidade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.CadastroWebPage;

public class RegisterWebFunctionality extends BaseTest{
	
	private CadastroWebPage cadastroWebPage;
	
	String name, cep, birthday, email, telephone, address, number, city, state;
	String newName, newCpf, newEmail, newCep, newAddress, newNumber, newPhoneNumber, newCity, newState;
	
	static Random random = new Random();
	public static int rng = random.nextInt(500);
	
	static int FixedValue = rng;
	
	
	public RegisterWebFunctionality() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }
	
//	------------------------------------------GETTING DATA FROM 4DEVS-----------------------------------------------
	public void clickGenerateData() {
		this.cadastroWebPage.getBtn4GeneratePerson().click();
	}
	
	public void storeData() throws IOException {
		
		name = this.cadastroWebPage.getField4Name().getText();
		email = this.cadastroWebPage.getField4Email().getText();
		cep = this.cadastroWebPage.getField4Cep().getText();
		address = this.cadastroWebPage.getField4Address().getText();
		number = this.cadastroWebPage.getField4Number().getText();
		city = this.cadastroWebPage.getField4City().getText();
		state = this.cadastroWebPage.getField4State().getText();
		telephone = this.cadastroWebPage.getField4Tel().getText();
		
		BufferedWriter buff = new BufferedWriter(new FileWriter("data.txt"));
		buff.write(name);
		buff.newLine();
		buff.write(email);
		buff.newLine();
		buff.write(cep);
		buff.newLine();
		buff.write(address);
		buff.newLine();
		buff.write(number);
		buff.newLine();
		buff.write(city);
		buff.newLine();
		buff.write(state);
		buff.newLine();
		buff.write(telephone);
		
		buff.close();
	}
//------------------------------------------END OF GETTING DATA FROM 4DEVS------------------------------------------------
	public void clickRegister() {
		this.cadastroWebPage.getButtonRegister().click();
	}
	
	public void writesOnInputs() throws IOException, InterruptedException {
		int i = 2;
		FileInputStream test = new FileInputStream("data.txt");
		Reader reader = new InputStreamReader(test, "UTF-8");
		BufferedReader buff = new BufferedReader(reader);
		
		String line = buff.readLine();
		newName = line;
		
		while (line != null) {
			line = buff.readLine();
			
			switch(i) {
				case 2:
					newEmail = line;
				case 3:
					newCep = String.valueOf(line);
				case 4: 
					newAddress = line;
				case 5:
					newNumber = line;
				case 6:
					newCity = line;
				case 7:
					newState = line;
				case 8:
					newPhoneNumber = line;
			}
			i++;
		}
		buff.close();
		
		wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getNameField()));
		this.cadastroWebPage.getNameField().sendKeys(newName);
		this.cadastroWebPage.getPhoneField().sendKeys(newPhoneNumber);
		this.cadastroWebPage.getEmailField().sendKeys(newEmail);
		this.cadastroWebPage.getAddressField().sendKeys(newAddress);
		this.cadastroWebPage.getCityField().sendKeys(newCity);
		this.cadastroWebPage.getStateField().sendKeys(newState);
		this.cadastroWebPage.getPostalCodeField().sendKeys(newCep);
		Select teste = new Select(this.cadastroWebPage.getSelectCountry());
		teste.selectByVisibleText("BRAZIL");
		this.cadastroWebPage.getUserField().sendKeys("Suiciniv" + FixedValue);
		this.cadastroWebPage.getPasswordField().sendKeys("teste123");
		this.cadastroWebPage.getConfirmPassword().sendKeys("teste123");
	}
	
	public void clickSubmit() {
		this.cadastroWebPage.getSubmitButton().click();
	}
	
	public String validating() {
		return this.cadastroWebPage.getLastText().getText();
	}
	
	

}
