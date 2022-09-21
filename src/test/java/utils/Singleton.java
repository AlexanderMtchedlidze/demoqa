package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.ConfigManager;

public class Singleton {
	private static ConfigManager config = new ConfigManager();
	private static String browser = config.getBrowser();
	private static WebDriver driver;

	public static WebDriver getDriver()
	{
		if (driver == null)
		{
			switch (browser) {
			case "chrome": {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
				driver = new ChromeDriver();
				break;
			}
			case "firefox": {
				System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
				driver = new FirefoxDriver();
				break;
			}
			default:
				System.out.println("Do not know how to start " + browser + ", starting chrome instead");
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
				driver = new ChromeDriver();
				break;
			}
		}
		return driver;
	}
}
