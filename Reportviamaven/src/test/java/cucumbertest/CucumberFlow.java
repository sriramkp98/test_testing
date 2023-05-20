package cucumbertest;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class CucumberFlow{

	public WebDriver driver;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
	    throw new io.cucumber.java.PendingException();
	}

	@And("user navigates to https://www.google.com\\")
	public void user_navigates_to_https_www_google_com() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter test in search box")
	public void user_enter_test_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("test");
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


//	public WebDriverWait wait;
//	@Given("User launch chrome browser")
//	public void user_launch_chrome_browser() {
//		
////		wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
//	    // Code to launch the Chrome browser
//	}
//
//	@When("User enter test in search box")
//	public void user_enter_test_in_search_box() {
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//		
//	    // Code to enter "test" in the search box
//	}
//
//	@And("User clicks on search button")
//	public void user_clicks_on_search_button() {
//	    // Code to click on the search button
////		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
//	}

	

}
