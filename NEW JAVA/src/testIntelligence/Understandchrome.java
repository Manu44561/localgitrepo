package testIntelligence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Understandchrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\MY SOFTWARE WORK\\New chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
	}

}
