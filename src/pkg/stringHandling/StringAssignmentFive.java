package pkg.stringHandling;

public class StringAssignmentFive {

	public static void main(String[] args) {
		String S1 = "My name is Nitish";
		String[] S2=S1.split(" ");
		int l = S2.length;
		
		for (int i=0 ; i<l;i++)
		{
			System.out.println("Length of "+i+"word is :"+S2[i].length());
			
		}
		

		
		
	}

}
