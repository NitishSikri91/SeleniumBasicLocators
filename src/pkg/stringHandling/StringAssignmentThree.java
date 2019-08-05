package pkg.stringHandling;

public class StringAssignmentThree {
	public static void main(String[] args) {
		String S1 = "My name is Nitish ";
		String[] S2 = S1.split(" ");
		int len = S2.length;
		for (int i =0;i<len;i++)
		{
			String[] S3 = S2[i].split("");
			int len1 = S3.length;
			for (int j = len1-1; j>=0;j--)
			{
				System.out.print(S3[j]);
			}
			System.out.print(" ");
		}
		
	}
}
