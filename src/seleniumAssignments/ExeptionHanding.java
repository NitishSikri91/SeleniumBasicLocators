package seleniumAssignments;

public class ExeptionHanding {

	public static void main(String[] args) {
		
		System.out.println("This is the first line");
		try {
		//int i = 1/0;
			int i = 1/2;
			System.out.println("I am inside exception block");
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
		
		System.out.println("This is the second line");
		
	}
	
	
	
}
