package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
public static WebDriver driver;
 void	openChrome(String url)
	{
	 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to(url);

	}
 
 void closeChrome()
 {
	 driver.close();
 }
}
