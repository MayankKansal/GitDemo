package seleniummock.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://fireapp.newsoftdemo.info/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("vinny@123789.org");
		driver.findElement(By.name("password")).sendKeys("1234");
		
		driver.findElement(By.className("btn-primary")).click();
		
		System.out.println(driver.findElement(By.className("invalid-feedback")).getText());
		//driver.findElement(By.cssSelector("button.submit")).click();
		
		
	//	driver.findElement(By.className("btn-link")).click();
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xxx");
		
	    System.out.println(	driver.getCurrentUrl());
	//	driver.close();
		
		

	}

}
