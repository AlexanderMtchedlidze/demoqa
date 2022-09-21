package config;

public class ConfigManager {
	private String url;
	private String browser;
	
	public ConfigManager() {
		this.url = "https://demoqa.com/";
		this.browser = "firefox";
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getBrowser() {
		return browser;
	}
}
