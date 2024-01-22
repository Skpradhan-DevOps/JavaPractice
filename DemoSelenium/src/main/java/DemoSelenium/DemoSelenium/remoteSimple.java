package DemoSelenium.DemoSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remoteSimple {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url=new URL("http://172.31.43.250:4444");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://www.aetna.com/");
		Thread.sleep(4000);
		
		System.out.println("Title is:"+driver.getTitle());
		
		driver.quit();

	}

}
