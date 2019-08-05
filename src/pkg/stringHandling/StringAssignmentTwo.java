package pkg.stringHandling;

public class StringAssignmentTwo {
public static void main(String[] args) {
	
	// Program to check if the String is palindrom or nor
	String S1 = "Nitin";
	String[] S2=S1.split("");
	int len = S2.length;
	String S3 = null;
	for (int i =len-1 ;i >=0;i--)
	{
		System.out.print(S2[i]);
		S3= S3 + S2;
	}
	
}
	
}
