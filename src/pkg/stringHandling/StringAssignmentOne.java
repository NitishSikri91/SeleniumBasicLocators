package pkg.stringHandling;

public class StringAssignmentOne {

	public static void main(String[] args) {
	String S1 = "My name is Nitish ";
	String[] S2 = S1.split(" ");
	int len = S2.length;
	
	for (int i = len-1; i >=0; i--)
	{
		System.out.print(S2[i]+ " ");
	}
	

	}

}
