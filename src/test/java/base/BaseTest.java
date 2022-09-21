package base;

import utils.Singleton;

public class BaseTest {
	public static void setUp(String url) {
		Singleton.getDriver().get(url);
	}
	
	public static void tearDown() {
		Singleton.getDriver().quit();
	}
}
