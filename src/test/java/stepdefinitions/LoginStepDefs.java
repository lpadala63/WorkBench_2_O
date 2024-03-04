package stepdefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageclass.Workbench_Launch;

public class LoginStepDefs {

	Workbench_Launch workbenchLaunch = new Workbench_Launch();

	@Given("^Login into Workbench$")
	public void login_into_Workbench() throws Throwable {
		workbenchLaunch.enterUserIDClickNext();
	}

	@And("^enter Password and launch Workbench$")
	public void enter_Password_and_launch_Workbench() throws IOException {
		workbenchLaunch.enterPasswordClickVerify();
	}

}
