package seleniummock.project1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); deprecated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// to Explicit wait,call WebDriverWait Constructor
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(1));
		

		/*
		 * String name =
		 * driver.findElement(By.xpath("//h4[contains(text(), 'Cucumber')]")).
		 * getText(); System.out.println(name); if(name.contains("Cucumber")){
		 * driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]")).
		 * click(); }
		 */

		String[] veggiesNeeded = { "Tomato", "Cucumber", "Potato", "Carrot" };

		addItems(driver, veggiesNeeded);
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	//	Thread.sleep(3000);
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

	//	Thread.sleep(2000);
		WebElement countryvalue = driver.findElement(By.xpath("//div[@class='wrapperTwo']//select"));
		Select dropdown = new Select(countryvalue);

		dropdown.selectByVisibleText("India");

		// driver.findElement(By.className("chkAgree")).click();

		driver.findElement(By.xpath("//div[@class='wrapperTwo']/button")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='errorAlert']/b")).getText(), 
				"Please accept Terms & Conditions - Required");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//div[@class='wrapperTwo']/button")).click();
	//	driver.close();
	}

	static void addItems(WebDriver driver, String[] veggiesNeeded) throws InterruptedException {

		List veggies = Arrays.asList(veggiesNeeded);
		List<WebElement> productname = driver.findElements(By.xpath("//h4[@class= 'product-name']"));
		for (int i = 0; i < productname.size(); i++) {
			// String name= productname.get(i).getText();

			String[] veggiesName = productname.get(i).getText().split("-");
			String formattedName = veggiesName[0].trim();

			int j = 0;
			if (veggies.contains(formattedName) && j < 4) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}
		}
		

	}

}
