package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG_code {
 
	//TestNG can be used without main method
	WebDriver driver;
	@BeforeTest
	public void initialization() {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		 driver=new ChromeDriver();
		 driver.get("https://trytestingthis.netlify.app");
		// driver.manage().window().maximize();
		
	}
	
	
	
	
//	Hint to debug: unless specified parallel run, tests always run sequentially. check test report to identify the failure reason(s).
	@Test
	public void navigateToContact() throws InterruptedException {
		
	//	driver.findElement(By.xpath("/html/body/div[2]/a[1]"));
		System.out.println("First test method is running");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/contact']")).click();
		
	//	driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/']")).click();
		
	}
	
	@Test(dependsOnMethods ={"navigateToContact"})
	public void clickOnRadioBtn() {
		System.out.println("Second test method is running");
		 WebElement radiobtn1=driver.findElement(By.id("female"));
		
		//isSelected
		radiobtn1.click();
	}
	
	@Test(dependsOnMethods ={"clickOnRadioBtn"})
	public void test3() {
		System.out.println("Third test method is running");
		
	}
	
	@AfterTest
	public void closeWindow() {
		System.out.println("AfterTest method is running");
		driver.close();
		
	}

}
