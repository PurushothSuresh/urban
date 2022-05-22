package Mindtree.Urban;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover {
	@Test
	public static void Test3()  {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement liv = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
		// li class="topnav_item livingunit"
		Actions drp = new Actions(driver);
		drp.moveToElement(liv).perform();
		driver.findElement(By.linkText("L Shaped Sofa Sets")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='Apollo Sectional Sofa (Fabric) Design']")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> lst = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		
		driver.findElement(By.xpath("//img[@alt='Apollo Sectional Sofa (Cobalt)']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='button full']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		
		// btn name="checkout"
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("sam@gmail.com");
		//placeholder="Enter Email"
		driver.findElement(By.xpath("//input[@placeholder='PIN Code']")).sendKeys("654321");
		//placeholder="PIN Code"
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@placeholder='Address']")).sendKeys("Banglore, Karnataka");
		// textarea placeholder="Address"
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sam");
		// placeholder="First Name"
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Smith");
		// placeholder="Last Name"
		
		driver.findElement(By.xpath("//input[@placeholder='Enter 10 digit mobile number']")).sendKeys("9876543210");
		// input placeholder="Enter 10 digit mobile number"
		
		driver.findElement(By.xpath("//input[@id='gstin']")).sendKeys("998876432101234");
		// id="gstin"
		driver.findElement(By.xpath("//input[@id='address-form-submit']")).click();
		
		
	}
	
}
