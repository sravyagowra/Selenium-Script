package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//Set the chrome driver properties
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Selenium jar files\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver1= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
        
		driver.manage().window().maximize();
	 String Expectedtitle = "OrangeHRM";
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	   Thread.sleep(3000);
	   String ActualTitle = driver.getTitle();
	   if(Expectedtitle.equals(ActualTitle))
	   {
	          driver.findElement(By.id("welcome")).click();
	          Thread.sleep(3000);
	          driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	          //driver.close();
	   }	
	}

}
