package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("userName")).sendKeys("sunil");
		//driver.findElement(By.name("password")).sendKeys("sunil");
		
		WebElement UN = driver.findElement(By.name("userName"));
		
		if(UN.isEnabled())
		{
			
			UN.sendKeys("sunil");
			Thread.sleep(3000);
			UN.clear();
			UN.sendKeys("sravya");
			
			
		}

		if(driver.findElement(By.name("userName")).isDisplayed())
			
		{
			//get the usaer name and print that user name in my console
			
		     //System.out.println(UN.getAttribute("value"));
			String name = UN.getAttribute("value");
			System.out.println(name);
			
			String name1 = UN.getAttribute("name");
			System.out.println(name1);
			
			String type = UN.getAttribute("type");
			System.out.println(type);
			
			String label1 = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
		    System.out.println(label1);
					
			
			
			
		}
	}

}
