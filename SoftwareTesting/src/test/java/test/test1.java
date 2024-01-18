package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import setup.chromesetup;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver.",
				"D:\\Selenium_test\\SoftwareTesting\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().fullscreen();
		
		
		chromesetup.Searchbox(driver).sendKeys("best places to eat in lucknow");
		chromesetup.Enter(driver).click();
		
		System.out.println("Test Automation Framework Setup done");
		
		
	}

}
