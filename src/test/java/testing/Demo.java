package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	    String url = "http://www.facebook.com";	
		System.setProperty("webdriver.chrome.driver", "D:\\year-2022\\Maven_Project\\driver\\chromedriver.exe");
		WebDriver  wb = new ChromeDriver();
		wb.manage().window().maximize();
	    wb.get(url);

	}

}
