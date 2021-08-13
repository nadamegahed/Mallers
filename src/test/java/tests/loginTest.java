package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginTest extends TestBase {
@BeforeClass
   void openDriver()
   {
	   openChrome("https://mallers-dashboard-staging.ibtikar.sa/login"); 
   }
@Test	
 public void validlogin() 
 {
	LoginPage loginAdmin =new LoginPage(driver);
	driver.navigate().refresh();
  

//	loginAdmin.sendEmail("");
   // loginAdmin.sendPassword("");
    //loginAdmin.clicklogin();
		
		
	}
}
