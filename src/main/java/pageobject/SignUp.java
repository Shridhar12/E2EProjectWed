package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
	
	public WebDriver driver;
	
	By firstname= By.xpath("//input[@type='text']");
	By Email= By.xpath("//input[@type='email']");
	By Password= By.xpath("//input[@type='password']");
	By ConPassword=By.xpath("//input[@type='password']");
	
	
	
	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement firstName()
	{
		return driver.findElement(firstname);
	}
	public WebElement email()
	{
		return driver.findElement(Email);
	}
	public WebElement paswword()
	{
		return driver.findElement(Password);
	}
	public WebElement conpssword()
	{
		return driver.findElement(ConPassword);
	}

}
