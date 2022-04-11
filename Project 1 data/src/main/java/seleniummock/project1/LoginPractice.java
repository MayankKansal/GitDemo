package seleniummock.project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='modal-content'] #okayBtn")));
		driver.findElement(By.cssSelector("div[class='modal-content'] #okayBtn")).click();

		WebElement usertype = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(usertype);

		dropdown.selectByValue("consult");;
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		addItem(driver);
		
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
	}

	
	static void addItem(WebDriver driver){
		
		List<WebElement> button= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0; i<button.size();i++){
			
			button.get(i).click();
		}
	}
}
