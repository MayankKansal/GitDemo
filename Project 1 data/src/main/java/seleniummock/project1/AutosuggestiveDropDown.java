package seleniummock.project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class ='ui-menu-item']/a"));

		for (WebElement option : options) {

			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("india")) {

				option.click();

				break;
			}
		}

		Assert.assertEquals(driver.findElement(By.id("autosuggest")).getAttribute("value"), "India");
		//driver.close();

		/*driver.findElement(By.id("autosuggest")).sendKeys("au");

		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class ='ui-menu-item']/a"));

		int count=driver.findElements(By.xpath("//li[@class ='ui-menu-item']/a")).size();

		System.out.println(count);

		for (WebElement option:options){
			
			System.out.println(option.getText());

		

		if(option.getText().equalsIgnoreCase("Nauru"))

		{

		option.click();
		Assert.assertEquals(driver.findElement(By.id("autosuggest")).getText(), "Nauru");
		//System.out.println(option.getText());

		break;

		}

	//	Assert.assertEquals(driver.findElement(By.id("autosuggest")).getText(), "Nauru");
*/	
	}
}
