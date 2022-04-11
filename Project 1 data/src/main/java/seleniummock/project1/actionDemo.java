package seleniummock.project1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions mouse = new Actions(driver);
		WebElement move=	driver.findElement(By.id("nav-link-accountList"));
		mouse.moveToElement(move).build().perform();
		
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("rock bluetooth earphone").doubleClick().build().perform();
		mouse.moveToElement(move).contextClick().build().perform();
		mouse.contextClick(move);

	}

}
