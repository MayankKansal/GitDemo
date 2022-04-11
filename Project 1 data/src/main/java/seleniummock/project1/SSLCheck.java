package seleniummock.project1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		/*FirefoxOptions options1 =new FirefoxOptions();
		options1.setAcceptInsecureCerts(true);*/
		
		//Download directory path set
		Map<String, Object> prefs= new HashMap<String, Object>();
		prefs.put("keys", "directory/path");
		option.setExperimentalOption("prefs", prefs);
		
		
		//to close browser pop up like allow locations allow notification
		option.setExperimentalOption("exludesSwitches", Arrays.asList("disable-popup-blocking"));
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}
}
