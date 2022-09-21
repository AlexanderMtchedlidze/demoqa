package demoqa;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.ConfigManager;
import pages.AlertPage;
import base.BaseTest;

public class AlertTest {
	private ConfigManager config = new ConfigManager();
	private String url = config.getUrl();

	@BeforeTest
	public void setUp() {
		BaseTest.setUp(url);
	}
	
	@Test
	public void alertTest() {
		var alertPage = new AlertPage();
		
		Assert.assertTrue(alertPage.isAlertsPageOpened(), "Alert page is not opened");
	}
	
	@AfterTest
	public void tearDown()
	{
		BaseTest.tearDown();
	}
}
