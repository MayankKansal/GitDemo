package seleniummock.project1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_NextMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();

		while (!driver
				.findElement(By
						.xpath("//div[contains(@class,'ui-datepicker-group-last')]//span[@class='ui-datepicker-month']"))
				.getText().contains("July")) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}

		List<WebElement> dateNumber = driver.findElements(By.xpath(
				"//div[contains(@class,'-group ui-datepicker-group-last')]//table[@class='ui-datepicker-calendar']//td[@data-event='click']"));
		int size = dateNumber.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {

			if (dateNumber.get(i).getText().equalsIgnoreCase("25")) {
				System.out.println(dateNumber.get(i).getText());
				driver.findElements(By
						.xpath("//div[contains(@class,'-group ui-datepicker-group-last')]//table[@class='ui-datepicker-calendar']//td[@data-event='click']"))
						.get(i).click();
				break;
			}
		}

	}

}
