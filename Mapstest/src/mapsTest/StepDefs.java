package mapsTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.After;


public class StepDefs {
	private SeleniumTest script;

	public void setUpWebDriver() throws Exception {

	   script = new SeleniumTest();

	   script.setUp();

	   script.goToHomePage();

	}

	public void tidyUp() {

	script.tearDown();

	}
	
	@Given("^I am on Google$")
	public void i_am_on_Google() throws Throwable {
	    setUpWebDriver();
	}

	@Given("^switch over to Maps$")
	public void switch_over_to_Maps() throws Throwable {
	    script.switchToMaps();
	}

	@When("^I search for DHBW Karlsruhe$")
	public void i_search_for_DHBW_Karlsruhe() throws Throwable {
	    script.searchDH();
	}
	
	@When("^I search for ZKM$")
	public void i_search_for_ZKM() throws Throwable {
	    script.searchZKM();
	}

	@Then("^the adress is Erzbergerstrasse (\\d+)$")
	public void the_adress_is_Erzbergerstrasse(int arg1) throws Throwable {
	    script.checkAdress(arg1);
	}

	@Then("^the city is (\\d+) Karlsruhe$")
	public void the_city_is_Karlsruhe(int arg1) throws Throwable {
	    script.checkCity(arg1);
	}


    @After

    public void tearDown() throws Exception {

       script.tearDown();

    }
	


}
