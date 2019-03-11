package noframework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_002 {
		public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Select passenger=new Select(driver.findElement(By.name("passCount")));
		passenger.selectByVisibleText("2");
		Select departFrom=new Select(driver.findElement(By.name("fromPort")));
		departFrom.selectByVisibleText("London");
		Select departOnMonth=new Select(driver.findElement(By.name("fromMonth")));
		departOnMonth.selectByVisibleText("September");
		Select departOnDate=new Select(driver.findElement(By.name("fromDay")));
		departOnDate.selectByVisibleText("10");
		Select arriveTo=new Select(driver.findElement(By.name("toPort")));
		arriveTo.selectByVisibleText("New York");
		Select returnOnMonth=new Select(driver.findElement(By.name("toMonth")));
		returnOnMonth.selectByVisibleText("November");
		Select returnOnDate=new Select(driver.findElement(By.name("toDay")));
		returnOnDate.selectByVisibleText("20");
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select airline=new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.xpath("//input[contains(@value,'7:10')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'14:30')]")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Naresh");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Prajapati");
		Select mealPassenger1=new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		mealPassenger1.selectByVisibleText("Hindu");
		driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Tye");
		driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Alli");
		Select mealPassenger2=new Select(driver.findElement(By.xpath("//select[@name='pass.1.meal']")));
		mealPassenger2.selectByVisibleText("Vegetarian");
		Select creditCard=new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
		creditCard.selectByValue("BA");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("12345678");;
		Select creditCardMonth=new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
		creditCardMonth.selectByVisibleText("10");
		Select creditCardYear=new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
		creditCardYear.selectByVisibleText("2009");
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Prajapati");
		driver.findElement(By.xpath("//input[@name='ticketLess']")).click();
		driver.findElement(By.xpath("//input[@name='billAddress1']")).clear();
		driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("20 xxxxxxxx");
		driver.findElement(By.xpath("//input[@name='billCity']")).clear();
		driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Brampton");
		driver.findElement(By.xpath("//input[@name='billState']")).clear();
		driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("ON");
		driver.findElement(By.xpath("//input[@name='delZip']")).clear();
		driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys("xxxxxxxx");
		Select billCountry=new Select(driver.findElement(By.xpath("//select[@name='billCountry']")));
		billCountry.selectByVisibleText("CANADA");
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		String actual=driver.findElement(By.xpath("//font[@size='+1']")).getText();
		System.out.println(actual);
		String expected="Your itinerary has been booked";
		if(expected==actual) {
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}

}
