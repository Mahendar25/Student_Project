package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> color=new Stack<>();
		Stack<String> col=new Stack<>();
		color.push(null);
		color.push(" ");
		color.push("white");
		color.push("white");
		color.push("Black");
		System.out.println("Colors in Stack: "+color);
		System.out.println("Top most element in stack: "+color.peek());
		color.pop();  //pop() method removes top most element in stack because it follows last in first out.
		System.out.println("Stack after deleting top of element: "+color);
		
		System.out.println("Searching element in stack or not: "+color.search(" "));
		col.push("Orange");
		col.push("Gray");
		col.addAll(0,color);
		System.out.println("Adding color stack to col stack : "+col);
		System.out.println("top most element in stack: "+col.peek());
		System.out.println("\nElements storing oreder in stack");
		while(!col.isEmpty()) {
			System.out.println(col.pop());
		}
		System.out.println(col);
		System.out.println(col.empty()); 
		//System.out.println("top most element in stack: "+col.peek());
		col.add("Apple");
		col.add("App");
		col.add(0, "Banana");
		System.out.println(col);
		System.out.println(col.size());
		col.trimToSize();
		System.out.println(col.size());
		
		
		
		
		
		
	}

}
