package io.duotech.step_definition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.beans.User;
import io.duotech.pages.CreateAccountPage;
import io.duotech.pages.HomePage;
import io.duotech.pages.LoginPage;
import io.duotech.pages.MyAccountPage;
import io.github.bonigarcia.wdm.Config;
import io.pages.utilities.BrowserUtilities;
import io.pages.utilities.ConfigReader;
import io.pages.utilities.Driver;
import io.pages.utilities.LoggerUtils;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class LoginStepDefinition {
	

	Logger logger = LoggerUtils.getLogger(LoginStepDefinition.class);
	
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		Driver.getDriver().manage().timeouts()
				.implicitlyWait(Long.parseLong(ConfigReader.getConfiguration("implicitTimeout")), TimeUnit.SECONDS);
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
		
		logger.info("Navigating to Home Page");
	}

	@When("I click on Sing")
	public void i_click_on_Sing() {
		HomePage homePage = new HomePage();
		homePage.signInLink.click();
		logger.info("Clicking on Sign in");
	}

	@Then("The login page title should be Login - My Store")
	public void the_login_page_title_should_be_Login_My_Store() {
		
		
		logger.info("Getting Page Title");
		
		String actual = Driver.getDriver().getTitle();
		String expected = "Login - My Store";
		logger.info("Verifying the title");
		Assert.assertEquals(expected, actual);
		logger.info("Title has been verify");
	}

	@Then("I should be able to see email, password box and login button")
	public void i_should_be_able_to_see_email_password_box_and_login_button() {
		LoginPage loginPage = new LoginPage();
		Assert.assertTrue(loginPage.emailInputBox.isDisplayed());
		Assert.assertTrue(loginPage.passwordInputButton.isDisplayed());
		Assert.assertTrue(loginPage.signInButton.isDisplayed());

	}

	@And("I enter duotech@gmail.com as email, dt123 as password, and click login")
	public void i_enter_duotech_gmail_as_email_dt123_as_password_and_click_login() {
		LoginPage loginPage = new LoginPage();
		loginPage.emailInputBox.sendKeys("duotech@gmail.com");
		loginPage.passwordInputButton.sendKeys("dt123");
		loginPage.signInButton.click();
	}

	@Then("I should be able to land on welcome page and read welcome message")
	public void i_should_be_able_to_land_on_welcome_page_and_read_welcome_message() {
		String expectedwelcomeMessage = "Welcome to your account. Here you can manage all of your personal information and orders.";
		MyAccountPage myAccountPage = new MyAccountPage();
		String actualWelcomeMessage = myAccountPage.welcomeMessage.getText();
		Assert.assertEquals(expectedwelcomeMessage, actualWelcomeMessage);

	}

	@When("I enter {string} as email, {string} as password, and click login")
	public void i_enter_as_email_as_password_and_click_login(String email, String pass) {
		LoginPage loginPage = new LoginPage();
		loginPage.emailInputBox.sendKeys(email);
		loginPage.passwordInputButton.sendKeys(pass);
		loginPage.signInButton.click();

	}

	@When("I enter the following credentinals, I should be able to login")
	public void i_enter_the_following_credentinals_I_should_be_able_to_login(Map<String, String> combinations) {
		LoginPage loginPage = new LoginPage();
		MyAccountPage myAccountPage = new MyAccountPage();
		Set<Entry<String, String>> entrySet = combinations.entrySet();

		for (Entry<String, String> entry : entrySet) {

			String email = entry.getKey();
			String password = entry.getValue();
			loginPage.emailInputBox.sendKeys(email);
			loginPage.passwordInputButton.sendKeys(password);
			BrowserUtilities.waitForClickablility(loginPage.signInButton, 2);
			loginPage.signInButton.click();

			i_should_be_able_to_land_on_welcome_page_and_read_welcome_message();
			myAccountPage.logOutButton.click();

		}
		{

		}
	

	}
	
	@When("I enter valid email and click Create Account")
	public void i_enter_valid_email_and_click_Create_Account() {
		LoginPage loginPage = new LoginPage();
		loginPage.createAccountEmail.sendKeys(new Faker().internet().emailAddress() );
		loginPage.createAccountButton.click();
	  
	}

	@When("I should be able to pass the following data and see the name")
	public void i_should_be_able_to_pass_the_following_data(List <User> list) {
	CreateAccountPage createAccountPage = new CreateAccountPage();
	
	createAccountPage.firstName.sendKeys(list.get(0).getFirstName());
	createAccountPage.lastName.sendKeys(list.get(0).getLastName());
	createAccountPage.password.sendKeys(list.get(0).getPassword());
	createAccountPage.selectDOB();
	createAccountPage.address.sendKeys(list.get(0).getAddress());
	createAccountPage.city.sendKeys(list.get(0).getCity());
	createAccountPage.selectState();
	createAccountPage.zip.sendKeys(list.get(0).getZip());
	createAccountPage.phoneNo.sendKeys(list.get(0).getPhone());
	
	createAccountPage.registerButton.click();
	
	String expected = list.get(0).getFirstName()+ " "+list.get(0).getLastName();
	String actual = new MyAccountPage().customerNAme.getText();
	Assert.assertEquals(expected, actual);
	
	MyAccountPage myAccountPage = new MyAccountPage();
	myAccountPage.logOutButton.click();
	
	}
	
	
	
	@When("I enter valid email {string} and click Create Account")
	public void i_enter_valid_email_and_click_Create_Account(String email) {
		LoginPage loginPage = new LoginPage();
		loginPage.createAccountEmail.sendKeys(email);
		loginPage.createAccountButton.click();
	
	}
	

}
