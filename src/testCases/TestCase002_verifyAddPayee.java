package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClasses.AccountSummaryPage;
import pageClasses.HomePage;
import pageClasses.LoginPage;


public class TestCase002_verifyAddPayee {

	WebDriver driver;
	HomePage hp;	
	LoginPage lp;
	AccountSummaryPage asp;

	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//Initialize the Page Factory objects
		hp=PageFactory.initElements(driver, HomePage.class);
		lp=PageFactory.initElements(driver, LoginPage.class);
		asp=PageFactory.initElements(driver, AccountSummaryPage.class);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	@Test
	public void verifyAddPayee() {
		hp.ClickSignIn();
		lp.doLogin("username", "password");
		
		
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
