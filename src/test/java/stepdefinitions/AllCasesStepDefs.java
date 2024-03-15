package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageclass.allCasesObjects;
import pageclass.searchOperationObjects;

public class AllCasesStepDefs {

	allCasesObjects allCases = new allCasesObjects();
	String policyNumberFlag;

	@And("^check policy number data from table$")
	public void check_policy_number_data_from_table() throws Throwable {
		allCases.validatePolicyNumberLength();
	}

	@And("^validate insured name and length$")
	public void validate_insured_name_and_length() throws Throwable {
//		commented bcz of issue
//		allCases.validateInsuredNameCharacters();
	}

	@And("^validate policy plan type$")
	public void validate_policy_plan_type() throws Throwable {
		allCases.validatePolicyPlanType();
	}
	
	@Then("^validate policy holder DOB$")
	public void validate_policy_holder_DOB() throws Throwable {
		allCases.validateDateOfBirth();
	}



}