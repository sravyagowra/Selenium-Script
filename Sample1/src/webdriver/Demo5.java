package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Selenium jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://elearning.upskills.in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
        driver.findElement(By.id("form-login_submitAuth")).click();
        driver.findElement(By.xpath("//*[@class='list-items-admin']/li[4]/a")).click();
        driver.findElement(By.xpath("//input[@name='import_file']")).sendKeys("C:\\Users\\SravyaGowra\\Desktop\\AA.csv");
        
        //driver.findElement(By.id)
        
      
      

	}

}
