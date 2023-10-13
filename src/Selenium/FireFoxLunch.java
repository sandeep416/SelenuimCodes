package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLunch {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","\\G:\\Softwares\\Web Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");	
	new FirefoxDriver();
	}

}
