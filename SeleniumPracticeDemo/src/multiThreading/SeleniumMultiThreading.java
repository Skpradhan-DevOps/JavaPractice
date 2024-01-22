package multiThreading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMultiThreading {
	
	public WebDriver driver;
	

	@SuppressWarnings("deprecation")
	public WebDriver setUp(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
