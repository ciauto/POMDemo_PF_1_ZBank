package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	
	
	
	//Locate web elements
	@FindBy(id="user_login")
	public WebElement usernametxtbox;
	
	
	@FindBy(id="user_password")
	public WebElement passwordtxtbox;
	
	
	@FindBy(name="submit")
	public WebElement Submitbtn;
	
	
	
	public void fillusername(String uname) {
		usernametxtbox.sendKeys(uname);
	}
	
	public void fillpassword(String pword) {
		passwordtxtbox.sendKeys(pword);
	}
	
	public void clickSubmitbtn() {
		Submitbtn.click();
	}
	
	public void dologin(String uname, String pword) {
		usernametxtbox.sendKeys(uname);
		passwordtxtbox.sendKeys(pword);
		Submitbtn.click();
	}
	
}
