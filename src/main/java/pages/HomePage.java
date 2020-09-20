package pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject
{
  public void navigate()
  {
	  open();
	  //getDriver().manage().deleteAllCookies();
  }
  
  public void enterUN()
  {
	  $("//input[@id='identifierId']").sendKeys("trainer@way2automation.com");
  }
  
  public void clickNext()
  {
	  $("//*[@id=\"identifierNext\"]/div/button").click();
	  Serenity.takeScreenshot();
  }
  
  public void enterPWD()
  {
	  $("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys("srk125879");
	  
  }
  
  
}
