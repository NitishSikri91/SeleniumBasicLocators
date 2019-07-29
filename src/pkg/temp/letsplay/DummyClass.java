package pkg.temp.letsplay;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DummyClass {

	public static ChromeDriver CDriver;
	
@BeforeTest
public static void btest() throws InterruptedException
{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	CDriver =new ChromeDriver(options);
	System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
	CDriver.get("https://phptravels.com/");
	CDriver.manage().window().maximize();
	Thread.sleep(2500);
	CDriver.findElement(By.xpath("//*[@class='mc-closeModal']")).click();
	
}

@Test
public static void test()
{
	
	

}


}
