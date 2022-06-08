package StepDefinition;

import java.sql.Driver;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	private LoginPage loginPage =new LoginPage(DriverFactory.getDriver());
	private static String title;
	private static String title2;
	
	
	
	
	@Given("user is on longin page")
	public void user_is_on_longin_page() {
	   DriverFactory.getDriver().get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("user get title of the page")
	public void user_get_title_of_the_page() {
	   title =loginPage.get_home_page_Title();
	   System.out.println("the Login page title is:  "+ title);
	}

	@Then("Loginpage title should be {string}")
	public void loginpage_title_should_be(String exptitlename) {
		Assert.assertTrue(title.equals(exptitlename)); 
	}

	@When("user enter the Email  {string}")
	public void user_enter_the_email(String emailid) {
		loginPage.enter_EmailID(emailid);  
	}

	@When("user enter the Password {string}")
	public void user_enter_the_password(String password) {
		 loginPage.enter_Password(password);
	}

	@When("user click longin button")
	public void user_click_longin_button() {
		loginPage.click_on_login_button();
	}

	@Then("homePage title should be {string}")
	public void page_title_should_be(String HomePagetTitil) {
		Assert.assertTrue(title.equals(HomePagetTitil));	
		
	}

	@When("user click on Log out button")
	public void user_click_on_log_out_button() {
		loginPage.click_on_logout_button();
	}

	@When("close browser")
	public void close_browser() {
	 loginPage.close_browser();
	}

}
