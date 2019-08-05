package pkg.stringHandling;

public class StringAssignmentSix {

	public static void main(String[] args) {

		String S1 = "My name is Nitish Sikri";
		int len = S1.length();
		int count =0;
		
		for(int i=0;i<len;i++)
		{
			if(S1.charAt(i)=='i')
			{
				count++;
			}
			
		}
		
		System.out.println("Number of time char i in String is "+ count);
		
		
	}

}
