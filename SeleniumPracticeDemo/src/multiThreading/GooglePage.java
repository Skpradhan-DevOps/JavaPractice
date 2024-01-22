package multiThreading;

import org.openqa.selenium.By;

public class GooglePage extends SeleniumMultiThreading {
	public void googleSearchTest() {
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele->System.out.print(ele.getText()));
	}
public void TearDown() {
	driver.quit();
}


}
