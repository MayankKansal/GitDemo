package seleniummock.project1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LinksCounts_And_Getting_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());  //get the number of links
		
		
		//get the link count on footer ,
		
		WebElement footer =driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size()); // Limiting WebDriver Scope
		
		WebElement firstColumn= footer.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"
				+ ""));
		System.out.println(firstColumn.findElements(By.tagName("a")).size());
		List<WebElement> linkclick =firstColumn.findElements(By.tagName("a"));
		Actions click = new Actions(driver);
		for(int i=0; i<linkclick.size();i++){
			
			click.moveToElement(linkclick.get(i)).keyDown(Keys.CONTROL).click().build().perform();
			
		}
		//linkclick.stream().
		/*linkclick.stream().forEach(s->{
			s.click();
		});*/
		
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		while(it.hasNext()){
			
			
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			
		}
		
		//driver.quit();
	}

}
