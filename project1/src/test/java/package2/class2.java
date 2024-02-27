package package2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		 WebDriverManager.chromedriver().clearDriverCache().setup();
		 WebDriver driver=new ChromeDriver();
	//	 driver.navigate().to("https://www.saucedemo.com/v1/");
		 
	 //-----navigation command--------
		/* driver.navigate().to("https://www.daraz.com.bd/"); 
		 driver.findElement(By.linkText("Become a Seller")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();   
		 Thread.sleep(2000);
		 driver.navigate().forward();*/
	//---check the state of webelement---
		 driver.get("https://trytestingthis.netlify.app/");
		//isDisplayed() method returns boolean value either True or False
		//Boolean Display = driver.findElement(By.xpath("//*[@id='next']")).isDisplayed();
		//To print the value
	//	System.out.println("Element displayed is :"+Display);
		 WebElement radiobtn1=driver.findElement(By.id("female"));
		 WebElement radiobtn2=driver.findElement(By.id("male"));
		
		 //isEnabled() method is used to check if the web element is enabled or disabled within the web page.
		 //generally web elements are enabled, but when "Accept terms and conditions" is not checked then isEnabled() for "Submit" button will return false, when checked it will enable the "Submit" button
		System.out.println("Is radiobtn1 is enabled:"+radiobtn1.isEnabled());
		System.out.println("Is radiobtn2 is enabled:"+ radiobtn2.isEnabled());
		
		//isSelected
		radiobtn1.click();
		System.out.println("Is radiobtn1 isSelected:"+radiobtn1.isSelected());
		

		WebElement chooseFile=driver.findElement(By.name("myfile"));
		System.out.println("Is choose file is visible:"+ chooseFile.isDisplayed());
		
		WebElement testdropdown=driver.findElement(By.id("option"));
		Select dropdown= new Select(testdropdown);
		dropdown.selectByIndex(2);
		
		dropdown.selectByValue("option 1");
		 Thread.sleep(1000);
		dropdown.selectByVisibleText("Option 3");
		
		
		//---select a single checkbox; to find element by multiple criteria use xpath
		 WebElement option2=driver.findElement(By.xpath("//input[@id='moption' and @name='option2']"));
		option2.click();
		 Thread.sleep(2000);
		//---deselect a single checkbox
		if (option2.isSelected()) {
			option2.click();
		}
		 Thread.sleep(2000);
		
		
		//-check multiple checkboxes---
		 /*Follow this
			 * By byXpath = By.xpath("//input[(@id='id_Start') and (@class = 'blabla')]");
					List<WebElement> elements = driver.findElements(byXpath);*/
		List<WebElement>  chkboxes= driver.findElements(By.xpath("//input[@id='moption' ]"));//import java.util.List this to solve error of list

	
		int size=chkboxes.size();

		for (int i=0; i<size; i++) {

		 chkboxes.get(i).click();}
		
		
		//driver.close();
		
	}

}
