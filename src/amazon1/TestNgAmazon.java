package amazon1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAmazon {
		WebDriver driver;
		Actions action;

	 @BeforeSuite
	public void amazonproject() {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	}
	@BeforeTest
	public void driversetup()  {
		 driver=new FirefoxDriver();
		 action=new Actions(driver);
		
	}
	
	@BeforeMethod
	public void urlpassing() throws IOException, InterruptedException {
	
		driver.get("https://www.google.com/"); 
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.ca/");
		Thread.sleep(3000);
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("c://Screenshot/screenshot_1.jpg"));
	}
	
	
	@Test
	public void loginamazon() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("c://Screenshot/screenshot_2.jpg"));
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
		File srcfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile1,new File("c://Screenshot/screenshot_3.jpg"));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[1]/div/div/a")).click();
		File srcfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile2,new File("c://Screenshot/screenshot_4.jpg"));
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Amitsinh");
		File srcfile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile3,new File("c://Screenshot/screenshot_5.jpg"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_email")).sendKeys("2265036609");
		File srcfile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile4,new File("c://Screenshot/screenshot_6.jpg"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_password")).sendKeys("amitsinhMahida");
		File srcfile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile5,new File("c://Screenshot/screenshot_7.jpg"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_password_check")).sendKeys("amitsinhMahida");
		File srcfile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile6,new File("c://Screenshot/screenshot_8.jpg"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		File srcfile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile7,new File("c://Screenshot/screenshot_9.jpg"));
		
		
	}
	
	
	  @AfterMethod 
	  
	  public void closebrowser() throws InterruptedException {
		  Thread.sleep(3000); 
		  driver.close(); }

}
