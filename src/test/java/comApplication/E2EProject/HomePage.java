package comApplication.E2EProject;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resources.Base;

import pageobject.LandingPage;
import pageobject.SignUp;

public class HomePage extends Base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		LandingPage l=new LandingPage(driver);
		l.getRegister().click();
		
		SignUp Si=new SignUp(driver);
		Si.firstName().sendKeys("VK");
		Si.email().sendKeys("Vk@gmail.com");
		Si.paswword().sendKeys("Vk@123");
		Si.conpssword().sendKeys("Vk@123");
		
		
	}

}
