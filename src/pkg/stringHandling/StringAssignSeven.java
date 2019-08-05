package pkg.stringHandling;

public class StringAssignSeven {

	public static void main(String[] args) {
		String S1 = "Dummy string to test string assign for dummy and string dummy occurance dummy response";
		String[] S2 =S1.split(" ");
		int l = S2.length;
		int count =0;
		
		for(int i=0;i<l;i++)
		{
			if(S2[i].equals("dummy"))
			{
				count++;
			}
		
		}
	
		System.out.println("Number of time dummy appears is "+ count);
	}

}
