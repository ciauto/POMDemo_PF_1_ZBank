package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	//Locate web elements
	@FindBy(id="signin_button")
	public WebElement signInBtn;

	public void ClickSignIn() {
		signInBtn.click();
	}
}
