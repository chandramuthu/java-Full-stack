package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer, String> m=new HashMap<Integer, String>();
	System.out.println(m.isEmpty());
	m.put(1, "Hi");
	m.put(25534, "Hello");
	m.put(3, "vanakam");
	m.put(4, "Namaskar");
	m.put(5, "Namaste");
	Set s= m.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		
		
		System.out.println(it.next());
	}
	m.replace(1, "hey");
	System.out.println(m);
	
	
	
	
	
	
	System.out.println(m.isEmpty());
	m.clone();
	System.out.println(m.entrySet());
	

}
}
