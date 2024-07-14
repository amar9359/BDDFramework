package steps;

import org.testng.Assert;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrghrmLoginStep {
	
	LoginPage loginPage;
	
	@Given("User launches the browser and hit thr url")
	public void user_launches_the_browser_and_hit_thr_url() {
		PredefinedActions.setup();
	}

	@When("User displays login page and verifies logoes, login panel")
	public void user_displays_login_page_and_verifies_logoes_login_panel() {
		loginPage = new LoginPage();
		System.out.println("VERIFY - Logo displayed on Login Page");
		boolean isLogoDisplayedFlag = loginPage.isLogoDisplayed();
		Assert.assertTrue(isLogoDisplayedFlag);

		System.out.println("VERIFY - Login Panel displayed on Login Page");
		boolean isLoginFormDisplayFlag = loginPage.isLoginPanelDisplayed();				
		Assert.assertTrue(isLoginFormDisplayFlag);
	}

	@When("User enters username, password and clicks on login button")
	public void user_enters_username_password_and_clicks_on_login_button() {
		final String username = "Admin";
		final String password = "veTy@M6GU2";

		System.out.println("STEP - Enter username");
		loginPage.enterUsername(username);
		
		System.out.println("STEP - Enter password");
		loginPage.enterPassword(password);
		
		System.out.println("STEP - User click on Login button on Login Page");
		loginPage.clickOnLoginButton();
	}

	@Then("User should be able to display URL endsWith dashboard")
	public void user_should_be_able_to_display_url_ends_with_dashboard() {
		System.out.println("VERIFY - URL endsWith dashboard");
		Assert.assertTrue(loginPage.getCurrentUrl().endsWith("dashboard"));
	}
	
	@Then("User closes browser")
	public void user_closes_browser() {
		System.out.println("Clean up - close browser");
		PredefinedActions.closeBrowser();
	}

}
