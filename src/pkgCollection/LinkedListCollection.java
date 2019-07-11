package pkgCollection;

import java.util.LinkedList;

public class LinkedListCollection extends ArrayListCollection {

	public static void main (String[] Args)
	{
		
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("One");
		LL.add("Two");
		LL.add("Three");
		System.out.println("Original Linked List " + LL );
		LL.add(2, "Three");
		System.out.println("New Linked List "+ LL);
		
		System.out.println("First Object in LL is "+ LL.getFirst());
		
		
				
		
	}
	
	
}
