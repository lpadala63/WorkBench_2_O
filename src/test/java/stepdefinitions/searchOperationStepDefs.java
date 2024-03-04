package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageclass.searchOperationObjects;

public class searchOperationStepDefs {
	
	searchOperationObjects searchOperation = new searchOperationObjects();
	
	@Then("^verify search tooltips$")
	public void verify_search_tooltips() throws Throwable {
		searchOperation.validateToolTips();
	}


	@And("^perform search using (.*) for (.*)")
	public void perform_search_and_validate_results(String keyword,String menuItem) throws Throwable {
		searchOperation.performSearchAndValidateResults(keyword,menuItem);
	}
	
	@Then("^validate search with (.*) and (.*) to compare for (.*)")
	public void validate_search_with_uppercase_and_lowercase_to_compare_for_menuitem(String keyword,String caseKeyword,String menuItem) throws Throwable {
		searchOperation.performCaseSensitiveSearchAndValidateResults(keyword,caseKeyword,menuItem);
	}
	
	@Then("^validate search keyword length limit using (.*) for (.*)")
	public void validate_search_keyword_length_limit_using_longKeyword(String keyword,String menuItem) throws Throwable {
		searchOperation.validateSearchKeywordLimit(keyword,menuItem);
	}
	
	@Then("^validate clear search feature$")
	public void validate_clear_search_feature() throws Throwable {
		searchOperation.validateClearSearch();
	}

	@Then("^validate search bar functionality$")
	public void validate_search_bar_functionality() throws Throwable {
		searchOperation.validateSearchFunctionality();
	}

	@Then("^validate search using (.*) from last page$")
	public void validate_search_using_amount_from_last_page(String amount) throws Throwable {
		searchOperation.validateUsingLastPageAmount(amount);
	}

	@Then("^perform search with (.*) in (.*) and complete search validation$")
	public void perform_search_with_specialCharacters_and_complete_search_validation(String keyword,String menuItem) throws Throwable {
		searchOperation.validateUsingSpecialCharacters(keyword,menuItem);
	}




}
