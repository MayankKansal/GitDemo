package seleniummock.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Test");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Test, share this practice page and share your knowledge");
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("name")).sendKeys("Test 123");
		driver.findElement(By.id("confirmbtn")).click();
		
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Test 123, Are you sure you want to confirm?");
		
		driver.switchTo().alert().accept();
		
		
	}

}
