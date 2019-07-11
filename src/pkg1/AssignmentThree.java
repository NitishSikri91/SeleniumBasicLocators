package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







public class AssignmentThree {

	ChromeDriver driver = new ChromeDriver(); 
	
	//Web page Automation without main method.
	@Before
	public void Launch()
	{
		System.out.println("I will execute befor anything. ");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
	}

	@Test
	public void fillvalues()
	{
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Sunnyboy");
		WebElement lname = driver.findElement(By.cssSelector("input[name=lastname]"));
		lname.sendKeys("Kha-ma-Khan");
		WebElement number = driver.findElement(By.cssSelector("input[name=reg_email__]"));
		number.sendKeys("9582148809");
	}
	
	@After
	public void aftervalues()
	{		
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
