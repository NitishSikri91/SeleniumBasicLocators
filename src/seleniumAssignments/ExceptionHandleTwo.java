package seleniumAssignments;

public class ExceptionHandleTwo {

	public static void main(String[] args) {
		int[] i = {1,12,123};
	System.out.println("This is the first line");
	try {
	 
		System.out.println(i[4]);
		System.out.println("I am inside exception block");
	}
	/*catch (Exception e) {
		e.printStackTrace();
	}*/
	finally {
		System.out.println("I am the final block");
	}
	
	System.out.println("This is the second line");
	
}
	
}
