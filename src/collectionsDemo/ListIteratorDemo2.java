package collectionsDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo2 {
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
				String val=(String) l.next();
				if(val.equals("Ajith"))
				{
					l.set("Ajith1");
					System.out.println(val);
				}
				else
				{
				System.out.println(l.next());
				}
			}
			/*while (l.hasPrevious()) 
			{
			String val=(String) l.previous();
			if(val.equals("nisha"))
			{
				l.set("Sai");
				System.out.println(l.next());
			l.previous();                                                   Assigning a new value.
			}
			else
			{
				System.out.println(val);
			}
				
				
			}
			*/
	}	
		
}

