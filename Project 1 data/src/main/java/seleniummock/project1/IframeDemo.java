package seleniummock.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		WebElement source= driver.findElement(By.id("draggable"));
		System.out.println(source.getText());
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();
		
		
		/*//Assignment to get the middle text
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
	
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']"))); //frame[@name='frame-middle'] frame-top
		
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		*/
	}
}