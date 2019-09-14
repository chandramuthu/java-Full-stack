package collectionsDemo;
import java.util.Comparator;
import java.util.TreeSet;

public class TreesetwithComparator {
	public static void main(String[] args) {
		TreeSet h= new TreeSet(new Comparator2());
		
		h.add("chandru");
		h.add("Vijay");
		h.add("nisha");
		h.add("Surya");
		h.add("Ajith");
		System.out.println(h);
	}
}
class Comparator2 implements Comparator
{

	
	public int compare(Object o1, Object o2) {
		String i1=(String) o1;
		String i2=(String) o2;
		return i2.compareTo(i1);
		
		
		//return i2.compareTo(i1);
		/*if(i1<i2)
			return +1;                              ***********All these codes will do the same functionality
		else if(i1>i2)                             *********** They are showing in Descending order
			return -1;
		else return 0; */
	}
	
}