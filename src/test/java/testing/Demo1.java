package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {
  
	public static void main(String[] args) {
				
		try {
			String url="http://www.google.com";
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\chrom\\chromedriver.exe");
			WebDriver wb = new ChromeDriver();
			wb.manage().window().maximize();
			wb.get(url);
			wb.findElement(By.name("q")).sendKeys("cardekho");
			Thread.sleep(5000);
			wb.findElement(By.name("btnK")).click();
		} catch (Exception e) {
			System.out.println("The net is not working");
		}
		
		
		
		

	}

}
