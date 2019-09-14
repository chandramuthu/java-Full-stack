package collectionsDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreemapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> m=new TreeMap<Integer, String>();
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
