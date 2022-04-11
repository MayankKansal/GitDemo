package seleniummock.project1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		/*driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it= win.iterator();
		String parentIt= it.next();
		String childIt = it.next();
		
		driver.switchTo().window(childIt);
		WebElement text= driver.findElement(By.cssSelector("p.im-para.red"));
		System.out.println(text.getText());
		
		String email =text.getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		//driver.switchTo().defaultContent();
		driver.switchTo().window(parentIt);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);*/
		
		
		//Assignment to get the text of child then parent
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		
		
		
	
	}

}
