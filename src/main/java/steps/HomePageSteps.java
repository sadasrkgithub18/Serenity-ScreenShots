package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps 
{
	HomePage homePage;
	
	@Step("Performing Login")
	public void doLogin()
	{
		homePage.navigate();
		homePage.enterUN();
		
	}
	
	@Step("Entering password")
	public void doEnterPwd()
	{
		homePage.clickNext();
		homePage.enterPWD();
	}
	
	
}
