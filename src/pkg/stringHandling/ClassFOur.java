package pkg.stringHandling;

public class ClassFOur {
public static void main(String[] args) {
	
	// If you are making any changes to the String , either you assign the new string to same reference var or a new one
	// String is an immutable class. One cannot make changes to it.
	
	String S = "Nitish";
	S=S.concat(" Sikri");
	System.out.println(S);

	
}
	
}
