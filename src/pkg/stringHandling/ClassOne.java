package pkg.stringHandling;

public class ClassOne {

	public static void main(String[] args) {
		
		// String s1 = "" ; wil always store the value in SCP (String constant pool).
		//Then S2 will go and search for the same string and both S1/S2 will point to the same position in memory.
		
		String S1 = "Nitish";
		String S2 ="Nitish";
		String S3 = new String("NItish"); // This will store the string in heap memory4
		String S4 = new String("Nitish");
		
		
		System.out.println(S1.compareTo(S3));
		
	/*	if(S4.equals(S3))
		{
			System.out.println("Content is same");
		}
		else
		{System.out.println("Content is not same");	}
		
		if(S4==S3) // Compares address
		{
		System.out.println("Address is same");
		}
		
		else 
		{System.out.println("Address is not same");
			
		}
		*/
		
		
		
	}
	
	
	
}
