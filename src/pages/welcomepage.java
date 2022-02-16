package pages;
import org.openqa.selenium.*;


public class welcomepage {
	WebDriver driver;
	WebElement button;

	{
		assert false;
		button = driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]"));
	}
	//By signUpbutton = By.linkText("");
	
	public welcomepage(WebDriver driver)
    {
		this.driver = driver;
	}
	  public void clicksignin(){
          driver.findElement((By) button).click();

  }
}
