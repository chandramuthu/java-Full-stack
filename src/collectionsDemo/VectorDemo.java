package collectionsDemo;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector a=new Vector();
	a.add(10);
	a.add(20);
	a.add("chandru");
	a.add("Vijay");
	a.add("Vijay");
	System.out.println(a);
	Vector b=new Vector();
	b.add(2);
	b.add(22);
	b.add("c2");
	b.add("2y");
	b.add("2");
	System.out.println(b);
	System.out.println(b.capacity());
	a.removeAllElements();
	System.out.println(a);
	
	System.out.println(b.lastElement());
	b.toString();
	
	System.out.println(b.toString());
}
}
