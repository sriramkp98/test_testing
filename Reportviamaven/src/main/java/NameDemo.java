import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
/*import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;*/

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NameDemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub      
		ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		ExtentTest test = extentReports.createTest("Whatsup Duck");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://devkeydemands.underdev.in/");
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[1]/div/input")).sendKeys("devkeydemand@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/input")).sendKeys("superadmin@1234");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[4]/button")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div/div/main/div[1]/nav/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div[1]/div[2]/div[2]/button")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[1]/div[1]/input")).sendKeys("User Name");
		driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[1]/div[2]/input")).sendKeys("Company Name");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[1]/div[2]/input")).clear();
		
		WebElement textbox=driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[3]/div[2]/input"));
		boolean status=textbox != null;
		System.out.println("Textbox is enabled?: "+status);
		WebElement getbuttonposition=driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[3]/div[2]/input"));
		Point a=getbuttonposition.getLocation();
		Point b=getbuttonposition.getLocation();
		int xvalue=a.getX();
		int yvalue=b.getY();
		System.out.println("xvalue: "+xvalue + "," + "yvalue: "+yvalue);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[3]/div[2]/input"));
		int height=button.getSize().getHeight();
		int width=button.getSize().getWidth();
		
		System.out.println("height: "+height + ","+ "width: "+width);

		
		WebElement colorbutton=driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[4]/button[2]"));
		String color=colorbutton.getCssValue("background-color");
		System.out.println("Color: "+color);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[3]/form/div[1]/div[8]/select"));
		Select value=new Select(dropdown);
		value.selectByVisibleText("Retail");
		/*WebElement uploadbutton=driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/form/div[2]/div[1]/div/div[1]/div[2]/label/div/svg/path"));
		uploadbutton.click();
		StringSelection selection=new StringSelection("C:\\Users\\Hp\\Downloads\\istockphoto-517188688-612x612.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);*/
		
		driver.findElement(By.xpath("/html/body/div/div/main/div[1]/nav/ul/li[1]/a")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement name=driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div[1]/div[1]/p[1]"));
		String tooltip=name.getAttribute("title");
		System.out.println(tooltip);


		driver.findElement(By.xpath("/html/body/div/div/main/div[1]/nav/ul/li[4]/a")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*driver.findElement(By.xpath("/html/body/div/div/main/div[2]/div[2]/div[2]/div/div/table/tbody/tr[6]/td[3]/div/button")).click();
		WebElement firstelement=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]"));
		WebElement secondelement=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/form/div[2]/div[4]/div/div/div[6]/div/div/div/input"));
		if(firstelement.isSelected()){
		firstelement.click();
		}
		else {
			secondelement.click();
		}*/
		test.pass("Test Passed");
		driver.quit();
		extentReports.flush();
	}
		
	

}
