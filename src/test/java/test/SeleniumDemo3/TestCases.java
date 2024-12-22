package test.SeleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver;
	
	@BeforeTest
	public void beforTest() {
		
		driver = new ChromeDriver();
    	driver.get("https://artoftesting.com/samplesiteforselenium");
		
	}
	
	@Test
	public void test1() throws InterruptedException {
String sampleText = driver.findElement(By.id("idOfDiv")).getText();
    	
    	// accessing the textbox with id fname and clicking submit button
    	driver.findElement(By.id("fname")).sendKeys(sampleText);
    	Thread.sleep(3000);
    	driver.findElement(By.id("fname")).clear();

	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.id("male")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("female")).click();
	}
	
	
	@AfterTest
	public void closeTest() {
		driver.close();
	}
	

	
}
