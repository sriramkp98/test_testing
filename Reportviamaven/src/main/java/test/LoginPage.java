package test;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test = extentReports.createTest("Login test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://qa.cloud.guhroo.co/");
//		
//		String sign_in="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[3]/button";
//		String username="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/input";
//		String password="/html/body/div/div[1]/div/section/div/div/div/div/div/form/div[2]/div/input";
//		String username_errormessage="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/div";
//		String password_errormessage="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[2]/div/div";
//		String forgot_password="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[4]/a";
//		String forgot_passwordusername="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/input";
//		String forgot_passwordsendlink="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[2]/button";
//		String forgot_usernameerrormessage="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/div";
//		String forgot_toastmessage="/html/body/div[1]/div[2]";
//		
//		  //Enter these values
//		  String password_value = "Pass@124";
//		  String existing_password_value = "Pass@123";
//		  String user_name="test7";
		  String email="emptest11@yopmail.com";
//
//		  //Sign in page
//		  String expectedresult_username = "Please enter your username to proceed.";
//		  String expectedresult_password = "Please enter your password to proceed.";
//		  String expectedresult_username1 = "You have entered a invalid username";
//		  String expectedresult_password2 = "The password you entered is incorrect"; 
//		  String expectedresult_invalid_usernamepassword = "Invalid username or password, try again.";
//		  
//		  //Forgot password page
//		  String expectedresult_invalid_username = "Please enter your username to proceed.";
//		  String expectedresult_invalid_username1 = "Invalid Username"; 
//		  String expectedresult_invalid_username2 = "Invalid Username";
//		  String expectedresult_invalid_username3 = "The username field is required.";
//		  String expectedresult_valid_username = "Please check your inbox for further instructions";
//
//		  //Scenario-1:To check the field validations(Error messages) for login page 
//		  
//		  //Testcase-1:Logging in without giving an username and password
//		  driver.findElement(By.xpath(sign_in)).click();
//		  Thread.sleep(2000);
//		  System.out.println("Scenario-1:To check the field validations(Error messages) for login page");
//		  System.out.print("\n");
//		  System.out.println("Testcase-1:Logging in without giving an username and password");
//		  String tc_1errormessageone=driver.findElement(By.xpath(username_errormessage)).getText();
//		  String tc_1errormessagetwo=driver.findElement(By.xpath(password_errormessage)).getText();
//		  boolean status_tc1=tc_1errormessageone.equals(expectedresult_username);
//		  boolean status1_tc1=tc_1errormessagetwo.equals(expectedresult_password);
//		  System.out.println(status_tc1);
//		  System.out.println(status1_tc1);
//          System.out.println(tc_1errormessageone);
//          System.out.println(tc_1errormessagetwo);
//          System.out.print("\n");
//          
//          //Testcase-2:Giving an empty space for username field
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(username)).sendKeys("   ");
//          driver.findElement(By.xpath(password)).sendKeys("   ");
//          driver.findElement(By.xpath(sign_in)).click();
//          Thread.sleep(2000);
//		  System.out.println("Testcase-2:Giving an empty space for username field");
//		  String tc_2errormessageone=driver.findElement(By.xpath(username_errormessage)).getText();
//		  boolean status_tc2=tc_2errormessageone.equals(expectedresult_username1);
//		  System.out.println(status_tc2);
//          System.out.println(tc_2errormessageone);
//          System.out.print("\n");
//          
//          //Testcase-3:Giving a valid username and invalid password
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(username)).clear();
//          driver.findElement(By.xpath(username)).sendKeys(user_name);
//          driver.findElement(By.xpath(password)).clear();
//          driver.findElement(By.xpath(password)).sendKeys("Password");
//          driver.findElement(By.xpath(sign_in)).click();
//          Thread.sleep(4000);
//		  System.out.println("Testcase-3:Giving a valid username and invalid password");
//		  String tc_3errormessageone=driver.findElement(By.xpath(password_errormessage)).getText();
//		  boolean status_tc3=tc_3errormessageone.equals(expectedresult_password2);
//		  System.out.println(status_tc3);
//          System.out.println(tc_3errormessageone); 
//          System.out.print("\n");
//        
//          //Testcase-4:Giving a invalid username and invalid password
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(username)).clear();
//          driver.findElement(By.xpath(username)).sendKeys("test8");
//          driver.findElement(By.xpath(password)).clear();
//          driver.findElement(By.xpath(password)).sendKeys("Password");
//          driver.findElement(By.xpath(sign_in)).click();
//          Thread.sleep(2000);
//		  System.out.println("Testcase-4:Giving a invalid username and invalid password");
//		  String tc_4errormessageone=driver.findElement(By.xpath(password_errormessage)).getText();
//		  boolean status_tc4=tc_4errormessageone.equals(expectedresult_invalid_usernamepassword);
//		  System.out.println(status_tc4);
//          System.out.println(tc_4errormessageone); 
//          System.out.print("\n");
//          
//          //Scenario-2:To check the field validations(Error messages) for forgot password page
//          
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(forgot_password)).click();
//          
//          //Testcase-5:Requesting a forgot password link without giving an username
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
//		  System.out.println("Testcase-5:Requesting a forgot password link without giving an username");
//		  Thread.sleep(2000);
//		  String tc_5errormessageone=driver.findElement(By.xpath(forgot_usernameerrormessage)).getText();
//		  boolean status_tc5=tc_5errormessageone.equals(expectedresult_invalid_username);
//		  System.out.println(status_tc5);
//          System.out.println(tc_5errormessageone); 
//          System.out.print("\n");
//          
//          //Testcase-6:Giving an invalid username
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys("test8");
//          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
//		  System.out.println("Testcase-6:Giving an invalid username");
//		  Thread.sleep(2000);
//		  String tc_6errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
//		  boolean status_tc6=tc_6errormessageone.equals(expectedresult_invalid_username1);
//		  System.out.println(status_tc6);
//          System.out.println(tc_6errormessageone); 
//          System.out.print("\n");
//          
//          //Testcase-7:Giving an email in username field
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(forgot_passwordusername)).clear();
//          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys("emptest11@YOPmail.com");
//          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
//		  System.out.println("Testcase-7:Giving an email in username field");
//		  Thread.sleep(2000);
//		  String tc_7errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
//		  boolean status_tc7=tc_7errormessageone.equals(expectedresult_invalid_username2);
//		  System.out.println(status_tc7);
//          System.out.println(tc_7errormessageone); 
//          System.out.print("\n");
//          
//          //Testcase-8:Giving an empty space username
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(forgot_passwordusername)).clear();
//          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys("  ");
//          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
//		  System.out.println("Testcase-8:Giving an empty space username");
//		  Thread.sleep(2000);
//		  String tc_8errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
//		  boolean status_tc8=tc_8errormessageone.equals(expectedresult_invalid_username3);
//		  System.out.println(status_tc8);
//          System.out.println(tc_8errormessageone); 
//          System.out.print("\n");
//          
//          //Testcase-9:Giving a valid username
//          Thread.sleep(5000);
//          driver.findElement(By.xpath(forgot_passwordusername)).clear();
//          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys(user_name);
//          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
//		  System.out.println("Testcase-9:Giving a valid username");
//		  Thread.sleep(2000);
//		  String tc_9errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
//		  boolean status_tc9=tc_9errormessageone.equals(expectedresult_valid_username);
//		  System.out.println(status_tc9);
//          System.out.println(tc_9errormessageone); 
//          System.out.print("\n");
//          
          //Scenario-3:To check a field validations for reset password page
          Thread.sleep(5000);
          driver.navigate().to("https://yopmail.com/?"+email);
          Thread.sleep(6000);
//          WebElement link=driver.findElement(By.xpath("/html/body/div[1]/div/main/div[2]/div[3]/div/div[1]/iframe"));
          driver.findElement(By.xpath("//*[@id=\"mail\"]/div/p[3]/a"));
//          linkclick.getAttribute("href");
          test.pass("Test Passed");
  		  driver.quit();
  		  extentReports.flush();
          //Testcase-10:Giving an empty space in password and confirm password
          
          
	}


}
