package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.linkText("Car Rentals"));
		Actions act = new Actions(driver);
		
		// Action is an even to perform on the Actions
		Action mouseover = act.moveToElement(link).build();
		mouseover.perform();
		act.sendKeys(link, (Keys.ENTER)).build().perform();
		
		
		
		

	}

}
