package test;




import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test = extentReports.createTest("Login test");
		Scanner browser=new Scanner(System.in);
		System.out.println("Enter browser name: ");
		String browser_name=browser.nextLine();
		WebDriver driver=null;
		
		if((browser_name.equals("Chrome"))||(browser_name.equals("chrome"))||(browser_name.equals("CHROME"))) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.get("https://qa.cloud.guhroo.co/");
		}
		
		else if((browser_name.equals("IE"))||(browser_name.equals("Internetexplorer"))||(browser_name.equals("InternetExplorer"))||(browser_name.equals("INTERNETEXPLORER"))||(browser_name.equals("internetexplorer"))){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://qa.cloud.guhroo.co/");
		}
		else {
			System.out.println("You have entered wrong browser name");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String sign_in="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[3]/button";
		String username="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/input";
		String password="/html/body/div/div[1]/div/section/div/div/div/div/div/form/div[2]/div/input";
		String username_errormessage="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/div";
		String password_errormessage="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[2]/div/div";
		String forgot_password="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[4]/a";
		String forgot_passwordusername="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/input";
		String forgot_passwordsendlink="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[2]/button";
		String forgot_usernameerrormessage="/html/body/div[1]/div[1]/div/section/div/div/div/div/div/form/div[1]/div";
		String forgot_toastmessage="/html/body/div[1]/div[2]";
		
		  //Enter these values
		 String login_username="devi";
		  String login_password="pass";
		  String password_value = "Pass@124";
		  String existing_password_value = "Pass@123";
		  String user_name="test7";
		  String email="emptest11@yopmail.com";

		  //Sign in page
		  String expectedresult_username = "Please enter your username to proceed.";
		  String expectedresult_password = "Please enter your password to proceed.";
		  String expectedresult_username1 = "You have entered a invalid username";
		  String expectedresult_password2 = "The password you entered is incorrect"; 
		  String expectedresult_invalid_usernamepassword = "Invalid username or password, try again.";
		  
		  //Forgot password page
		  String expectedresult_invalid_username = "Please enter your username to proceed.";
		  String expectedresult_invalid_username1 = "Invalid Username"; 
		  String expectedresult_invalid_username2 = "Invalid Username";
		  String expectedresult_invalid_username3 = "The username field is required.";
		  String expectedresult_valid_username = "Please check your inbox for further instructions";

		  //Scenario-1:To check the field validations(Error messages) for login page 
		  
		  //Testcase-1:Logging in without giving an username and password
		  driver.findElement(By.xpath(sign_in)).click();
		  Thread.sleep(2000);
		  System.out.println("Scenario-1:To check the field validations(Error messages) for login page");
		  System.out.print("\n");
		  System.out.println("Testcase-1:Logging in without giving an username and password");
		  String tc_1errormessageone=driver.findElement(By.xpath(username_errormessage)).getText();
		  String tc_1errormessagetwo=driver.findElement(By.xpath(password_errormessage)).getText();
		  TakesScreenshot tk=(TakesScreenshot) driver;
		  File source= tk.getScreenshotAs(OutputType.FILE);
		  File des=new File("D:/Login/tc1.png");
		  FileUtils.copyFile(source,des);
		  boolean status_tc1=tc_1errormessageone.equals(expectedresult_username);
		  boolean status1_tc1=tc_1errormessagetwo.equals(expectedresult_password);
		  System.out.println(status_tc1);
		  System.out.println(status1_tc1);
          System.out.println(tc_1errormessageone);
          System.out.println(tc_1errormessagetwo);
          System.out.print("\n");
          
          //Testcase-2:Giving an empty space for username field
          Thread.sleep(5000);
          driver.findElement(By.xpath(username)).sendKeys("   ");
          driver.findElement(By.xpath(password)).sendKeys("   ");
          driver.findElement(By.xpath(sign_in)).click();
          Thread.sleep(2000);
		  System.out.println("Testcase-2:Giving an empty space for username field");
		  String tc_2errormessageone=driver.findElement(By.xpath(username_errormessage)).getText();
		  TakesScreenshot tk1=(TakesScreenshot) driver;
		  File source1= tk1.getScreenshotAs(OutputType.FILE);
		  File des1=new File("D:/Login/tc2.png");
		  FileUtils.copyFile(source1,des1);
		  boolean status_tc2=tc_2errormessageone.equals(expectedresult_username1);
		  System.out.println(status_tc2);
          System.out.println(tc_2errormessageone);
          System.out.print("\n");
          
          //Testcase-3:Giving a valid username and invalid password
          Thread.sleep(5000);
          driver.findElement(By.xpath(username)).clear();
          driver.findElement(By.xpath(username)).sendKeys(user_name);
          driver.findElement(By.xpath(password)).clear();
          driver.findElement(By.xpath(password)).sendKeys("Password");
          driver.findElement(By.xpath(sign_in)).click();
          Thread.sleep(4000);
		  System.out.println("Testcase-3:Giving a valid username and invalid password");
		  String tc_3errormessageone=driver.findElement(By.xpath(password_errormessage)).getText();
		  TakesScreenshot tk2=(TakesScreenshot) driver;
		  File source2= tk2.getScreenshotAs(OutputType.FILE);
		  File des2=new File("D:/Login/tc3.png");
		  FileUtils.copyFile(source2,des2);
		  boolean status_tc3=tc_3errormessageone.equals(expectedresult_password2);
		  System.out.println(status_tc3);
          System.out.println(tc_3errormessageone); 
          System.out.print("\n");
        
          //Testcase-4:Giving a invalid username and invalid password
          Thread.sleep(5000);
          driver.findElement(By.xpath(username)).clear();
          driver.findElement(By.xpath(username)).sendKeys("test8");
          driver.findElement(By.xpath(password)).clear();
          driver.findElement(By.xpath(password)).sendKeys("Password");
          driver.findElement(By.xpath(sign_in)).click();
          Thread.sleep(2000);
		  System.out.println("Testcase-4:Giving a invalid username and invalid password");
		  String tc_4errormessageone=driver.findElement(By.xpath(password_errormessage)).getText();
		  TakesScreenshot tk3=(TakesScreenshot) driver;
		  File source3= tk3.getScreenshotAs(OutputType.FILE);
		  File des3=new File("D:/Login/tc4.png");
		  FileUtils.copyFile(source3,des3);
		  boolean status_tc4=tc_4errormessageone.equals(expectedresult_invalid_usernamepassword);
		  System.out.println(status_tc4);
          System.out.println(tc_4errormessageone); 
          System.out.print("\n");
          
          //Scenario-2:To check the field validations(Error messages) for forgot password page
          
          Thread.sleep(5000);
          driver.findElement(By.xpath(forgot_password)).click();
          
          //Testcase-5:Requesting a forgot password link without giving an username
          Thread.sleep(5000);
          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
		  System.out.println("Testcase-5:Requesting a forgot password link without giving an username");
		  Thread.sleep(2000);
		  String tc_5errormessageone=driver.findElement(By.xpath(forgot_usernameerrormessage)).getText();
		  TakesScreenshot tk4=(TakesScreenshot) driver;
		  File source4= tk4.getScreenshotAs(OutputType.FILE);
		  File des4=new File("D:/Login/tc5.png");
		  FileUtils.copyFile(source4,des4);
		  boolean status_tc5=tc_5errormessageone.equals(expectedresult_invalid_username);
		  System.out.println(status_tc5);
          System.out.println(tc_5errormessageone); 
          System.out.print("\n");
          
          //Testcase-6:Giving an invalid username
          Thread.sleep(5000);
          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys("test8");
          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
		  System.out.println("Testcase-6:Giving an invalid username");
		  Thread.sleep(2000);
		  String tc_6errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
		  TakesScreenshot tk5=(TakesScreenshot) driver;
		  File source5= tk5.getScreenshotAs(OutputType.FILE);
		  File des5=new File("D:/Login/tc6.png");
		  FileUtils.copyFile(source5,des5);
		  boolean status_tc6=tc_6errormessageone.equals(expectedresult_invalid_username1);
		  System.out.println(status_tc6);
          System.out.println(tc_6errormessageone); 
          System.out.print("\n");
          
          //Testcase-7:Giving an email in username field
          Thread.sleep(5000);
          driver.findElement(By.xpath(forgot_passwordusername)).clear();
          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys("emptest11@YOPmail.com");
          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
		  System.out.println("Testcase-7:Giving an email in username field");
		  Thread.sleep(2000);
		  String tc_7errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
		  TakesScreenshot tk6=(TakesScreenshot) driver;
		  File source6= tk6.getScreenshotAs(OutputType.FILE);
		  File des6=new File("D:/Login/tc7.png");
		  FileUtils.copyFile(source6,des6);
		  boolean status_tc7=tc_7errormessageone.equals(expectedresult_invalid_username2);
		  System.out.println(status_tc7);
          System.out.println(tc_7errormessageone); 
          System.out.print("\n");
          
          //Testcase-8:Giving an empty space username
          Thread.sleep(5000);
          driver.findElement(By.xpath(forgot_passwordusername)).clear();
          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys("  ");
          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
		  System.out.println("Testcase-8:Giving an empty space username");
		  Thread.sleep(2000);
		  String tc_8errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
		  TakesScreenshot tk7=(TakesScreenshot) driver;
		  File source7= tk7.getScreenshotAs(OutputType.FILE);
		  File des7=new File("D:/Login/tc8.png");
		  FileUtils.copyFile(source7,des7);
		  boolean status_tc8=tc_8errormessageone.equals(expectedresult_invalid_username3);
		  System.out.println(status_tc8);
          System.out.println(tc_8errormessageone); 
          System.out.print("\n");
          
          //Testcase-9:Giving a valid username
          Thread.sleep(5000);
          driver.findElement(By.xpath(forgot_passwordusername)).clear();
          driver.findElement(By.xpath(forgot_passwordusername)).sendKeys(user_name);
          driver.findElement(By.xpath(forgot_passwordsendlink)).click();
		  System.out.println("Testcase-9:Giving a valid username");
		  Thread.sleep(2000);
		  String tc_9errormessageone=driver.findElement(By.xpath(forgot_toastmessage)).getText();
		  TakesScreenshot tk8=(TakesScreenshot) driver;
		  File source8= tk8.getScreenshotAs(OutputType.FILE);
		  File des8=new File("D:/Login/tc9.png");
		  FileUtils.copyFile(source8,des8);
		  boolean status_tc9=tc_9errormessageone.equals(expectedresult_valid_username);
		  System.out.println(status_tc9);
          System.out.println(tc_9errormessageone); 
          System.out.print("\n");
          
          //Scenario-3:To check a field validations for reset password page
          Thread.sleep(5000);
          driver.navigate().back();
          driver.findElement(By.xpath(username)).clear();
          driver.findElement(By.xpath(username)).sendKeys(login_username);
          driver.findElement(By.xpath(password)).clear();
          driver.findElement(By.xpath(password)).sendKeys(login_password);
          driver.findElement(By.xpath(sign_in)).click();
          Thread.sleep(9000);
          test.pass("Test Passed");
  		  driver.quit();
  		  extentReports.flush();
  		
          //Testcase-10:Giving an empty space in password and confirm password
          
          
	}


}
