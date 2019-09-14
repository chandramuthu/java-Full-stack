package collectionsDemo;

import java.util.LinkedList;

public class ArrayListDemo2 {
public static void main(String[] args) {
	LinkedList a=new LinkedList();
	a.add(10);
	a.add(20);
	a.add("chandru");
	a.add("Vijay");
	a.add("Vijay");
	System.out.println(a);
	LinkedList b=new LinkedList();
	b.add(2);
	b.add(22);
	b.add("c2");
	b.add("2y");
	b.add("2");
	System.out.println(b);
	b.add(a);
	System.out.println(b);
System.out.println(b.equals(b));
//	b.trimToSize();
	System.out.println(b.containsAll(a));
	System.out.println(b.get(0));
	
	}
}
