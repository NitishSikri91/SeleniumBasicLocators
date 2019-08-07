package pkg.temp.letsplay;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DummyOneT {

	@Parameters({"Browser","URL"})
	@Test
	public void test1( @Optional String name,@Optional String another)
	{
		if(name.equals("Chrome"))
		{
			ChromeDriver driver = new ChromeDriver();
			System.setProperty("system.chrome.driver", "C:\\\\SeleniumDrivers\\\\chromedriver.exe");
			driver.get(another);
		}
		
	}
	
}


