package collectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList a=new LinkedList();
	a.add(10);
	a.add(20);
	a.add("chandru");
	a.add("Vijay");
	a.add("Vijay1");
	System.out.println(a);
	LinkedList b=new LinkedList();
	b.add(2);
	b.add(22);
	b.add("c2");
	b.add("2y");
	b.add("2");
	System.out.println(b);
	System.out.println(a.getFirst());
	System.out.println(a.getLast());
	System.out.println(a.removeFirst());
	System.out.println(a.removeLast());
	b.addFirst(a);
	System.out.println(b);
	b.addLast(a);
	System.out.println(b);
}
}



