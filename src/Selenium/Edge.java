package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "G:\\Softwares\\Web Drivers\\edgedriver_win64\\msedgedriver.exe");
		new EdgeDriver();
	}

}
