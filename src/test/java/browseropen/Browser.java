package browseropen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
	
	WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//*[@class='gb_y'])[1]")).click();
		
		
		
		System.out.println("Himanshu");

		
        driver.quit();
	}

}
