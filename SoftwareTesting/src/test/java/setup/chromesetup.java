package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chromesetup {

	public static WebElement Searchbox(WebDriver driver) {

		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

		return search;

	}

	public static WebElement Enter(WebDriver driver) {

		WebElement entersearch = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));

		return entersearch;
	}

}
