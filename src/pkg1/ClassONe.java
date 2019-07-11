package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassONe {

	
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	driver.get("https://www.fb.com");
	driver.manage().window().maximize(); //Maximizing the Chrome window
	// Lets inspected the elements with different ways ---------
	/*WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("abc@abc.com");
	WebElement pass = driver.findElement(By.name("pass"));
	pass.sendKeys("Password");*/
	
	WebElement fname = driver.findElement(By.name("firstname"));
	fname.sendKeys("Sunnyboy");
	
	WebElement lname = driver.findElement(By.cssSelector("input[name=lastname]"));
	lname.sendKeys("Kha-ma-Khan");
	
	WebElement number = driver.findElement(By.cssSelector("input[name=reg_email__]"));
	number.sendKeys("9582148809");
	
	
		Select date = new Select(driver.findElement(By.cssSelector("select[name=birthday_day]")));
		date.selectByIndex(18);
		
		Select dob_month = new Select(driver.findElement(By.cssSelector("select[name=birthday_month]")));
		dob_month.selectByVisibleText("Feb");
	
		Select dob_year = new Select(driver.findElement(By.cssSelector("select[name=birthday_year]")));
		dob_year.selectByVisibleText("1991");
		
		
		WebElement radio = driver.findElement(By.cssSelector("input[id=u_0_9]"));
		radio.click();

	
	
	
	

	
	
	
	
	
	}
}
