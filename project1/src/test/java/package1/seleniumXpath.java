package package1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumXpath {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 driver.findElement(By.id("login-button")).click();
		// /html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button
		 
		// driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();//add to cart-->inspect-->copy full xpath
		
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	//shopping_cart_link
	driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
	//*[@id="shopping_cart_container"]/a/span
	driver.findElement(By.cssSelector("button#checkout")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.id("first-name")).sendKeys("Nusrat");
	 driver.findElement(By.id("last-name")).sendKeys("Amin");
	 driver.findElement(By.id("postal-code")).sendKeys("3211");
	 driver.findElement(By.cssSelector("input#continue")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.cssSelector("button#finish")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.cssSelector("button#back-to-products")).click();
				 
	}

}
