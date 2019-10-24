package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest {
	

	WebDriver dr ;
	
	
	
	


@Given("^Open firefox and start application$")
public void Open_firefox_and_start_application() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "..//Selenium_Cucumber_project/drivers/chromedriver1.exe");
	
	dr = new ChromeDriver();
	System.out.println("hello");
	dr.get("http://www.facebook.com");
	dr.manage().window().maximize();
	

}

@When("^I enter valid username and valid password$")
public void I_enter_valid_username_and_valid_password() throws Throwable {
	
	dr.findElement(By.id("email")).sendKeys("torahulpandey@gmail.com");
	dr.findElement(By.id("pass")).sendKeys("PWC137&");
	

}

@Then("^user should be able to login successfully$")
public void user_should_be_able_to_login_successfully() throws Throwable {

	dr.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	dr.close();
}


}
