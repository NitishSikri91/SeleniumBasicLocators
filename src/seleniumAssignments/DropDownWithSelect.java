package seleniumAssignments;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownWithSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		
		
		WebElement OriginLoc = driver.findElement(By.cssSelector("input[type=text]"));
		OriginLoc.click();
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		WebElement Travel_date =driver.findElement(By.cssSelector("div[aria-label=Wed Jul 24 2019]"));
		Travel_date.click();
		
		
		
		//List<WebElement> list=  driver.findElements(By.cssSelector("div[class=DayPicker-Day]"));
		//WebElement date = list.get(21);
		//date.click();
		
		//System.out.println("Current Selection "+list.get(20));
		
		
		/*WebElement button =driver.findElement(By.cssSelector("label[id=loginbutton]"));
		ac.keyDown(Keys.CONTROL).click(button).keyUp(Keys.CONTROL).build().perform();
		System.out.println("Current URL is "+ driver.getCurrentUrl());
		System.out.println("Lets Switch to other window");	
		//Following method will retunr the current focused window
		String Focus_window = driver.getWindowHandle();
		System.out.println("Focus Window" + Focus_window);
		
		Set<String> All_window =  driver.getWindowHandles();
		int count =All_window.size();
		
		for (String s : All_window)
		{
			driver.switchTo().window(s);
		}
		//need to use the following code for multiple windoe switch
		Set<String> All_window =  driver.getWindowHandles();
		int count =All_window.size();
		int a=0;
		for (String s : All_window)
		{
			a=++;
			for (a==3)
			{
			driver.switchTo().window(s);
			break;
			}
			
			}
		System.out.println("After switching current url is " + driver.getCurrentUrl());
		*/
		
		
		
		
		
	}

}
