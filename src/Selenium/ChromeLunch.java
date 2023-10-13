package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLunch {

	public static void main(String[] args) 
	{
		
	//System.setProperty("webdriver.chrome.driver","G:\\Softwares\\Web Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		new ChromeDriver();
	}

}
