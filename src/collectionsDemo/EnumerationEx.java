package collectionsDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {
	public static void main(String[] args) {
		
		Vector b=new Vector();
		b.add(2);
		b.add(22);
		b.add("c2");
		b.add("2y");
		b.add("2");
		b.add(2);
		b.add(22);
		b.add("c2");

		System.out.println(b);
		Enumeration e=b.elements();
		while(e.hasMoreElements())
				{
			System.out.println(e.nextElement());
				}
		
	}
}
