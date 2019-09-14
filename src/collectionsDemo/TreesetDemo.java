package collectionsDemo;

import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet<String> h= new TreeSet<String>();
		
		h.add("chandru");
		h.add("Vijay");
		h.add("nisha");
		h.add("Surya");
		h.add("Ajith");
		h.add("Ajith");
		System.out.println(h.descendingSet());
	}
}
