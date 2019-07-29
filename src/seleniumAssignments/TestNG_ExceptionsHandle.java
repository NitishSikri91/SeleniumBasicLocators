package seleniumAssignments;

import org.testng.annotations.Test;

public class TestNG_ExceptionsHandle {

	
	@Test (expectedExceptions = NumberFormatException.class)
	public void testExcep()
	{
		String s = "100A";
		Integer.parseInt(s);
		
	}
	
	
	
	
	
}
