package pkg.stringHandling;

public class ClassThree {
public static void main(String[] args) {
	
	String s ="My name is Nitish";
	String[] S1 =s.split(" ");
	System.out.println("Number of words "+S1.length );
	int lengthOfString = S1.length;
	
	for(int i=0;i<lengthOfString;i++)
	{
		System.out.println(S1[i]);
	}
	
	
}
}
