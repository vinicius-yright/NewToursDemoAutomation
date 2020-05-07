package automacao.src.test.java.br.com.steps.web;

import java.io.IOException;

import org.junit.Assert;

import br.com.automacao.web.funcionalidade.RegisterWebFunctionality;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RegisterWebSteps {
	
	private RegisterWebFunctionality registerWebFuncionalidade;
	
	public RegisterWebSteps() {
		this.registerWebFuncionalidade = new RegisterWebFunctionality();
	}
	
	//PARTE DE RECEBER OS DADOS DA 4DEV
	

		@Given("^that i'm on the (\\d+)devs website$")
		public void thatIMOnTheDevsWebsite(int arg1)  {
			System.out.println("Acessando o site");
		}
		
		@When("^i click on the Gerar Pessoa button$")
		public void iClickOnTheGerarPessoaButton() {
			this.registerWebFuncionalidade.clickGenerateData();
		}
		
		@Then("^i see multiple information and store it$")
		public void visualizoEArmazenoDadosValidosAleatorios() throws InterruptedException, IOException{
			Thread.sleep(2000);
			this.registerWebFuncionalidade.storeData();
		}
		
	//FIM DA PARTE DE RECEBER OS DADOS DA 4DEV	
	
	@Given("^that i click on the Register here button$")
	public void thatIClickOnTheRegisterHereButton() {
		this.registerWebFuncionalidade.clickRegister();
	}
	@When("^i fill all the input fields with the data from (\\d+)devs$")
	public void iFillAllTheInputFieldsWithTheDataFromDevs(int arg1) throws IOException, InterruptedException  {
		this.registerWebFuncionalidade.writesOnInputs();
	}

	@And("^click on the Submit button$")
	public void clickOnTheSubmitButton() {
		this.registerWebFuncionalidade.clickSubmit();
	}

	@Then("^i visualize the text \"([^\"]*)\"$")
	public void iVisualizeTheText(String arg1) {
		Assert.assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", this.registerWebFuncionalidade.validating());
	}


	
}
