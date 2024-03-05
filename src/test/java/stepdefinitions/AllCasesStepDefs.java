package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageclass.allCasesObjects;
import pageclass.searchOperationObjects;

public class AllCasesStepDefs {
	
	allCasesObjects allCases = new allCasesObjects();
	
	@Then("^check policy number data from table$")
	public void check_policy_number_data_from_table() throws Throwable {
	   System.out.println("lalalal");
	}

}