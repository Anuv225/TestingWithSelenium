package test.SeleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //adding the web driver which is used to interact with browser
    	WebDriver driver = new ChromeDriver();
    	
    	//Using the actions class to click button
    	Actions action = new Actions(driver);
    	
    	//to open the url
    	
    	driver.get("https://artoftesting.com/samplesiteforselenium");
    	
    	String sampleText = driver.findElement(By.id("idOfDiv")).getText();
    	
    	// accessing the textbox with id fname and clicking submit button
    	driver.findElement(By.id("fname")).sendKeys(sampleText);
    	Thread.sleep(3000);
    	driver.findElement(By.id("fname")).clear();

    	
    	
    	//clicking the button
    	driver.findElement(By.id("idOfButton")).click();
    	
    	//double clicking the button dblClkBtn
    	//this will not work you have to create actions
//    	driver.findElement(By.id("dblClkBtn")).click();
//    	driver.findElement(By.id("dblClkBtn")).click();
    	
//    	WebElement doubleClickBtn = driver.findElement(By.id("dblClkBtn"));
//    	
//    	action.doubleClick(doubleClickBtn).perform();
//    	

    	
    	
    	
    	//radio buttons
    	
    	driver.findElement(By.id("male")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("female")).click();
    	
    	//checkboxes
    	//using css selector
    	
    	driver.findElement(By.cssSelector("input.Automation")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("input.Performance")).click();
    	
    	//Using the Selecct class
    	Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
    	dropdown.selectByVisibleText("Manual Testing");
    	
    	
    	
    	
    	
    	
//    	//driver returns the tyoe webelement
//    	WebElement singleClickBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/main/article/div/div/div[2]/button"));
//    	Thread.sleep(3000);
//    	action.click(singleClickBtn).perform();
//    	
    	
    	//to close the browser
    	driver.close();
    	
    	
    	
    	
    }
}
