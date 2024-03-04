package pageobjects;

import org.openqa.selenium.By;

public class SwagLabsPageObject1 {

	public static By SwagLabs1_off_test_name_user = By.xpath("//input[@autocorrect='off' and @data-test='username' and @name='user-name' and @id='user-name' and @placeholder='Username' and @type='text' and @autocapitalize='none' and @class='input_error form_input']");

	public static By SwagLabs1_off_test = By.xpath("//input[@autocorrect='off' and @data-test='password' and @name='password' and @id='password' and @placeholder='Password' and @type='password' and @autocapitalize='none' and @class='input_error form_input']");

	public static By SwagLabs1_test_login_name = By.xpath("//input[@data-test='login-button' and @name='login-button' and @id='login-button' and @type='submit' and @class='submit-button btn_action' and @value='Login']");

}