package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	
	
	
	//Register
	By Register=By.cssSelector("a[href*='sign_up']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	public WebElement getRegister()
	{
		return driver.findElement(Register);
	}

}
