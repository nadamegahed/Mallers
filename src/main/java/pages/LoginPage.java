package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageBase{
 
	public LoginPage(WebDriver driver) {
		super(driver);
	}
    
	@FindBy(id="email-field")
	WebElement email;
	
	@FindBy(id = "password-field")
	WebElement password;
    
	@FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[5]/button")
	WebElement loginbtn;
	public void sendEmail(String Email)
	{ 
		email.sendKeys(Email);
	}
	public void sendPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void clicklogin()
	{
		loginbtn.click(); 
	}
}

