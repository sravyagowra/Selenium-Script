package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
  	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  	    WebElement login = driver.findElement(By.id("btnLogin"));
  	    Actions act = new Actions(driver);
  	    //Action mouseover = act.moveToElement(login).build();
  	   // mouseover.perform();
  	    act.sendKeys(login, (Keys.ENTER)).build().perform();
  	    act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
  	    WebElement link = driver.findElement(By.linkText(""));
  	    Action mouseover = act.moveToElement(target);
  	    
  	    
  	    
  	    

	}

}
