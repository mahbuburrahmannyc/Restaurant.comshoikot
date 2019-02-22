package Openbrowserwayfair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	
	public static void main(String[]args) {
		
	
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.get("https://www.restaurant.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class=\"signIn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("alamsam476@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("zunaira2015");
		driver.findElement(By.xpath("//*[@class=\"btn btn-success has-spinner button green\"]")).click();
				

				
		
		
	
	

}
}