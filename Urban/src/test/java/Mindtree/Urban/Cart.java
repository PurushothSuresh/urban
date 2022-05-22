package Mindtree.Urban;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cart {
	@Test
	public static void Test1()  {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		// home page
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("coffee tabel");
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		//id="search_button"
		driver.findElement(By.xpath("//a[@data-ga='Image'] //img[@class='lazy product-img-default']")).click();
		
		// windows handler
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> lst = new ArrayList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		
		// adding to cart 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@data-galabel='add to cart']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@data-event='Checkedout Order']")).click();
		// btn data-event="Checkedout Order"
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
		//id="address-form-submit"
	}

}
