package seleniummock.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor_tableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement position= driver.findElement(By.cssSelector("#mousehover"));
		int x= position.getLocation().getX();
		int y = position.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		js.executeScript("window.scroll("+x+","+y+")");
		driver.close();
driver.getTitle();
	}

}
