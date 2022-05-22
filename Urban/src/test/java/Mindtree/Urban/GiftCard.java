package Mindtree.Urban;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GiftCard {
	@Test
	public static void Test2()  {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Gift Cards")).click();
	    
	    driver.findElement(By.xpath("//img[@alt='House Warming Gift Card by Urban Ladder']")).click();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='amount_select']")).click();
	    driver.findElement(By.xpath("//input[@name='amount_select']")).sendKeys("1000");
	    
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//option[@value='6/2022']")).click();
	    driver.findElement(By.xpath("//option[@value='25']")).click();
	    driver.findElement(By.xpath("//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")).click();
	    
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='recipient_name']")).sendKeys("Puru");
	    driver.findElement(By.xpath("//input[@name='recipient_email']")).sendKeys("purus@gmail.com");
	    driver.findElement(By.xpath("//input[@name='customer_name']")).sendKeys("king");
	    driver.findElement(By.xpath("//input[@name='customer_email']")).sendKeys("king@gmail.com");
	    driver.findElement(By.xpath("//input[@name='customer_mobile_number']")).sendKeys("9876543210");
	    driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("A Small Gift");
	    
	    driver.findElement(By.xpath("//button[@class='_3Hxyv _1fVSi action-button _1gIUf _1XfDi']")).click();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//div[@class='_2wEGI'] //button[@class='_3NxK9 _1fVSi action-button _1gIUf _1XfDi']")).click();
	}

}

