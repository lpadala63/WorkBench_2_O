package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageclass.UiValidationObjects;
import pageclass.searchOperationObjects;

public class UiValidationStepDefs {

	UiValidationObjects uiElements = new UiValidationObjects();
	searchOperationObjects searchOperation = new searchOperationObjects();

	@Then("^validate workbench launch$")
	public void validate_workbench_launch() throws Throwable {
		uiElements.verifyWorkbenchLaunch();
	}

	@Then("^validate header elements visibility$")
	public void validate_header_elements_visibility() throws Throwable {
		uiElements.validateHeaderElements();
	}

	@Then("^scroll down the page to verify header$")
	public void scroll_down_the_page_to_verify_header() throws Throwable {
		uiElements.scrollDownValidateHeader();
	}

	@Then("^navigate to All Cases and verify header$")
	public void navigate_to_All_Cases_and_verify_header() throws Throwable {
		uiElements.validateAllCasesHeader();
		uiElements.navigateToleftPannelVerifyHeader();
	}

	@Then("^navigate to Workbasket and verify header$")
	public void navigate_to_Workbasket_and_verify_header() throws Throwable {
		uiElements.validateWorkbasketHeader();
		uiElements.navigateToleftPannelVerifyHeader();
	}

	@Then("^navigate to Pending and verify header$")
	public void navigate_to_Pending_and_verify_header() throws Throwable {
		uiElements.validatePendingHeader();
		uiElements.navigateToleftPannelVerifyHeader();
	}

	@Then("^navigate to Issued & Reported Cases and verify header$")
	public void navigate_to_Issued_Reported_Cases_and_verify_header() throws Throwable {
		uiElements.validateIssuedReportedHeader();
		uiElements.navigateToleftPannelVerifyHeader();
	}

	@Then("^navigate to Inactive and verify header$")
	public void navigate_to_Inactive_and_verify_header() throws Throwable {
		uiElements.validateInactiveHeader();
		uiElements.navigateToleftPannelVerifyHeader();
	}
	
	@Then("^open every menu item in new tab and validate header$")
	public void open_every_menu_item_in_new_tab_and_validate_header() throws Throwable {
	   uiElements.navigateToNewTabAndValidateHeader();
	}
	
	@Then("^validate tooltip text for all menu items$")
	public void validate_tooltip_text_for_all_menu_items() throws Throwable {
		uiElements.validateAllToolTips();
	}
	
	@Then("^perform export and validate header$")
	public void perform_export_and_validate_header() throws Throwable {
		uiElements.performExport();
	}

	@Then("^perform sort filter with (.*) and complete header validation$")
	public void perform_sort_filter_and_complete_header_validation(String keyword) throws Throwable {
		uiElements.performBasicSort();
		uiElements.performBasicFilterFunctionality(keyword);
	}
	
	@Then("^navigate to (.*)$")
	public void navigate_to_menuitem(String menuitem) throws Throwable {
		uiElements.navigateToMenuitem(menuitem);
	}

	@Then("^click on Logo and verify (.*) page$")
	public void click_on_Logo_and_verify_page(String menuitem) throws Throwable {
		uiElements.clickLogoNavigateToMenuitem(menuitem);
	}

	@Then("^verify greeting message , title and icons on the page$")
	public void verify_greeting_message_title_and_icons_on_the_page() throws Throwable {
		uiElements.verifyWelcomeMessageAndIcons();
	}

	@Then("^verify table columns and rows for (.*)$")
	public void verify_table_columns_and_rows(String menuitem) throws Throwable {
		uiElements.navigateToMenuitem(menuitem);
		uiElements.verifyTableColumnsAndRows(menuitem);
	}
	
	@Then("^verify filter icon for all columns in (.*) page$")
	public void verify_filter_icon_for_all_columns_in_page(String menuitem) throws Throwable {
		uiElements.validateFilterIcons(menuitem);
	}

	@Then("^validate pagination and complete ui validation$")
	public void validate_pagination_and_complete_ui_validation() throws Throwable {
	   searchOperation.validatePagenation();
	}


}
