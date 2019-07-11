package pkgCollection;

import java.util.Stack;

public class StackColllections {

	public static void main(String[] args) {
		Stack<Double> st = new Stack<Double>();
		st.push(11.00);
		st.push(22.11);
		st.push(33.11);
		st.push(44.22);
		
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		System.out.println("Current element to be popped is "+ st.peek());
		
	}
	
}
