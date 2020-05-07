package br.com.automacao.configuration;

import br.com.automacao.commons.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{
	
	@Before(value = "@register") 
		public void beforeTestRegister() {
			initializeWebApplication(Web.CHROME_WINDOWS, true);
		}
	@Before(value = "@loginTest")
		public void beforeTestLogin() {
			initializeWebApplication(Web.CHROME_WINDOWS, true);
	   }
	@Before(value = "@get4dev")
		public void before4Dev() {
			initializeWebApplication(Web.CHROME_WINDOWS, false);
	    }
	@Before(value = "@booking")
	public void beforeTestBooking() {
		initializeWebApplication(Web.CHROME_WINDOWS, true);
   }
	@After(value = "@get4dev") 
		public void after4Dev() {
			closeWeb();
		}
	@After(value = "@loginTest")
		public void afterTestLogin() {
			closeWeb();
		}
	@After(value = "@register")
		public void afterTestRegister() {
			closeWeb();
	}
	@After(value = "@booking")
	public void afterTestBooking() {
		closeWeb();
}
	
}
