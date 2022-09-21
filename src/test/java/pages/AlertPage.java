package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Singleton;

public class AlertPage {
	private static WebDriver driver;
	
	public AlertPage() {
		driver = Singleton.getDriver();
	}
	
	public boolean isAlertsPageOpened() {
		WebElement homeContent = driver.findElement(By.xpath("//div[@class='home-body']"));
		return homeContent.isDisplayed();
	}
}
