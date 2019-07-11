package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public void selectDropDown(Select elem , String str)
	{
		elem.selectByVisibleText(str);
	}
	
	
	public static void main(String[] args) {
		AssignmentTwo obj = new AssignmentTwo();
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		// Let us select the drop down and call by Select drop down method.
		
		Select dob_date = new Select(driver.findElement(By.cssSelector("select[name=birthday_day]")));
		String str = "11";
		obj.selectDropDown(dob_date,str);
		
		
		Select dob_month = new Select(driver.findElement(By.cssSelector("select[name=birthday_month]")));
		String str1="Feb";
		obj.selectDropDown(dob_month, str1);
		
		
		Select dob_year = new Select(driver.findElement(By.cssSelector("select[name=birthday_year]")));
		String str2="1991";
		obj.selectDropDown(dob_year, str2);
		
		
		
		
		
	}

}
