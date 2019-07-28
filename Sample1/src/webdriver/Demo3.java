package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("sunil");
		 driver.findElement(By.name("password")).sendKeys("sunil");
		  //driver.findElement(By.name("login")).click();
		 driver.findElement(By.xpath("//input[@name='login']")).click();
		 
		 if(driver.findElement(By.xpath("//input[@name='tripType' or @value='roundtrip']")).isSelected())
		 
		 {
			 driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
			 
		 }
		 
		 WebElement DD = driver.findElement(By.xpath("//select[@name='passCount']"));
		 Select sel = new Select(DD);
		 List<WebElement> data=sel.getOptions();
		 System.out.println(data.size());
		 for(int i=0;i<data.size();i++)
		 {
			 System.out.println(data.get(i).getText());
			 
		 }
		 //1st option
		 sel.selectByVisibleText("2");
		 Thread.sleep(3000);
		 //2nd option
		 sel.selectByIndex(2);
		 Thread.sleep(3000);
		 //3rd option
		 sel.selectByValue("1");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@value='Business']")).click();
		 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		 driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		 driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Sravya");
		 driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Gowra");
		 driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1234567890");
		 //driver.findElement(By.xpath("//input[@name='ticketLess']")).click();
		 //driver.findElement(By.xpath("//*[contains(text(),'Same')]")).click();
		 List<WebElement> checkbox= driver.findElements(By.xpath("//input[@name='ticketLess']"));
         for(WebElement e :checkbox)
		 {
			 e.click();
			 
		 }
		 
		 
	
		 
		 
		 
		 
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
        
		  
		  

	}

}
