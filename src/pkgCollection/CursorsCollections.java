package pkgCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CursorsCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		List1.add(101);
		List1.add(102);
		List1.add(103);
		List1.add(104);
		List1.add(105);
		List1.add(102);
		List1.add(null);
	
		Iterator<Integer> itr = List1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("One");
		LL.add("Two");
		LL.add("Three");
		LL.add("Four");
		
	
		
		
		
		
	}
	
	
}
