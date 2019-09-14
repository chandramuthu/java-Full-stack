package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add("chandru");
		a.add("Vijay");
		a.add("Vijay");
		a.add("Vijay");
		a.add("Vijay");
		a.add(10);
		a.add(20);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			Object name=i.next();
			if(name.equals("Vijay"))
			{
				i.remove();
			}
			else{
				
			
			System.out.println(name);
			}
		}
		System.out.println(a);
	}
}
