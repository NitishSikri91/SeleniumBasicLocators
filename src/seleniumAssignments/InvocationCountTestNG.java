package seleniumAssignments;

import org.testng.Assert;
import org.testng.annotations.Test;



public class InvocationCountTestNG {

	
	@Test(invocationCount = 5)
	public void sum()
	{
		int a=10;
		int b =20;
		int c = a+b;
		System.out.println("Sum of the digits = "+ c);
		
		Assert.assertEquals(c, 25 ,"Actual value is not 25");
		
		
	}
	
	
}
