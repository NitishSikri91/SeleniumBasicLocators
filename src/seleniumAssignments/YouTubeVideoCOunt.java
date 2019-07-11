package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeVideoCOunt {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	Actions ac = new Actions(driver);
	
	List<WebElement> ListWE=  driver.findElements(By.cssSelector("a#video-title"));
	List<WebElement> ListWE1 = driver.findElementsById("video-title");
	
	ListWE.size();
	
	System.out.println("Number of videos on page"+ ListWE.size() + "  " + ListWE1.size());
	
	ListWE.get(3).click();		
	
	
	
			
	}
}
