package pkgCollection;

import java.util.ArrayList;


public class ArrayListCollection {

	
	
	
	public static void main(String[] args) {

		//Declaring an object of the array list
		
			
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		List1.add(101);
		List1.add(102);
		List1.add(103);
		List1.add(104);
		List1.add(105);
		List1.add(102);
		List1.add(null);
		
		
		System.out.println(List1);
		
		List1.remove(3);
			
		System.out.println(List1);
		System.out.println("Size of Array is "+List1.size());
		
		ArrayList<Integer> List2 = new ArrayList<Integer>(List1);
		
		System.out.println(List2);
		List2.add(1, 111);
		System.out.println(List2);
		//List2.set(2, 222);
		//System.out.println(List2);
		
		System.out.println("First occurance "+ List2.lastIndexOf(102));
		ArrayList<Integer> List3 =new ArrayList<Integer>(List1.subList(1, 3));
		
		System.out.println(List3);
		
		
		
		
		
		
		
		
	}

}
