package collectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> m=new LinkedHashMap<Integer, String>();
		m.put(1, "Hi");
		m.put(25534, "Hello");
		m.put(3, "vanakam");
		m.put(4, "Namaskar");
		m.put(5, "Namaste");
		
		System.out.println(m);
		m.clone();
		System.out.println(m);

	}
}
