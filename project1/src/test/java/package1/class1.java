package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 Thread.sleep(4000);
		 driver.findElement(By.id("login-button")).click();
	 
		 
		 String expected="https://www.saucedemo.com/v1/inventory.html";
		 String actual=driver.getCurrentUrl();
		 System.out.println(driver.getCurrentUrl());
		 if(expected.equals(actual)) {
			 System.out.println("URL Matched");
		 }
		 else  System.out.println("URL does not match");
	}

}
