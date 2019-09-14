package collectionsDemo;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(10);
	s.push("chandru");
	s.push("vijay");
	s.push("bala");
	s.push('c');
	s.push(10);
	s.push(10);
	s.push(10);
	s.push(10);
	s.push(10);
	System.out.println(s);
	s.pop();
	System.out.println(s);
	
	System.out.println(s.peek());
	
	System.out.println(s.search(10));
	
	
}
}
