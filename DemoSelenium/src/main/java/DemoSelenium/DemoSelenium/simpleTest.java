package DemoSelenium.DemoSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class simpleTest {

	public static void main(String[] args) throws  InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		String chromeDriver = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromeDriver);
		
		WebDriver driver = 	new ChromeDriver();
		driver.get("https://www.aetna.com/");
		
		Thread.sleep(4000);
		
		System.out.println("Title is:"+driver.getTitle());
		
		driver.quit();
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver drivers = new RemoteWebDriver(url,dc);
		

	}

}
