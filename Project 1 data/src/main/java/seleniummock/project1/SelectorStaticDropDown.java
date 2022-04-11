package seleniummock.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SelectorStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		System.out.println("----------------------------------");
		
		WebElement staticDropown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select selector = new Select(staticDropown);
		
		selector.selectByIndex(2);
		System.out.println(selector.getFirstSelectedOption().getText());
		
		selector.selectByValue("USD");
		System.out.println(selector.getFirstSelectedOption().getText());
		
		selector.selectByVisibleText("AED");
		System.out.println(selector.getFirstSelectedOption().getText());

	
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		
		driver.findElement(By.id("hrefIncAdt")).click();
		
		for(int i=1; i<5;i++)
		{	
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.close();
		
	}
	
	
	

}
