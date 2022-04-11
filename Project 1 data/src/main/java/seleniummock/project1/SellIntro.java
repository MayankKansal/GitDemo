package seleniummock.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
    WebDriver  driver = new ChromeDriver();
	    
//	//	ChromeDriver driver  = new ChromeDriver();
	
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\workspace\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	*/	
		driver.get("httpS://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String pageSource = driver.getPageSource(); 
		//System.out.println("the source code of the page is :"+ pageSource);
		
		
		driver.close();
		
		//driver.quit();
		
	}

}
