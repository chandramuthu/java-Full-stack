package collectionsDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("chandru");
		a.add("Vijay");
		a.add("nisha");
		a.add("Surya");
		a.add("Ajith");
		System.out.println(a);
		ListIterator l=a.listIterator();
			while(l.hasNext())
			{
				System.out.println(l.next()+"  ");
				
			}
			while (l.hasPrevious()) 
			{
			String val=(String) l.previous();
			if(val.equals("nisha"))
			{
				l.set("Sai");
				System.out.println(l.next());
			l.previous();
			}
			else
			{
				System.out.println(val);
			}
				
				
			}
			
			
			
	}
}
