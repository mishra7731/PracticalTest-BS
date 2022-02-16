package test;
import pages.welcomepage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.signUp;

//import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class signintest {
	String driverpath = "F:\\Java\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	welcomepage objWP;
	//signUp objsignup;
	
	@BeforeTest 
	public void setup(){
		System.setProperty("webdriver.chrome.driver", driverpath);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://automationpractice.com/index.php");
	    
	}
	@Test 
	public void testingsignUp() {
		objWP = new welcomepage(driver);
		objWP.clicksignin();
		
	}

	

}
