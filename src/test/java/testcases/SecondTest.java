package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class SecondTest 
{
   @Managed
   WebDriver driver;
   
   @Steps
   HomePageSteps homePageSteps;
   
   
   
   @Title("Executing Second test")
   @Test
   //  @Screenshots(afterEachStep = true)
   public void secondTest()
   {
	   homePageSteps.doLogin();
	   homePageSteps.doEnterPwd();
   }
   
   @Title("Executing Third test")
   @Test
   // @Screenshots(forEachAction = true)
   public void thirdTest()
   {
	   homePageSteps.doLogin();
	   homePageSteps.doEnterPwd();
   }
}
