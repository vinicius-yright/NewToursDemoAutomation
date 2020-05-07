package automacao;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.automacao.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author vinicius.brito
 *
 */
	
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/cucumber.json" }, features = { "./src/test/resources/features" }, glue = {
				"br.com.automacao.configuration","automacao/src/test/java/br/com/steps/web" },
		
//		@get4dev = use to get the data used in the register tag 
//		@register = use to create a new account
//		@loginTest = login duuuuuuuuuuuuuuuuuuuuuh
//		@booking = booking a trip
        tags = {"@get4dev, @register, @booking"})

public class RunTest extends BaseTest {
		@AfterClass
		public static void AfterTests() {
			if (webDriver != null) {
				closeWeb();
			}
		}
}
