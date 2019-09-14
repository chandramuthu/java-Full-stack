package collectionsDemo;
import java.util.*;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo  {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new Mycomparator1());
	t.add(10);
	t.add(34);
	t.add(443);
	t.add(3);
	System.out.println("Set is: "+t);
}
}
class Mycomparator1 implements Comparator
{
	public int  compare(Object o1,Object o2)
	{
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		return -i1.compareTo(i2);
		//return i2.compareTo(i1);
	/*if(i1<i2)
		return +1;
	else if(i1>i2)
		return -1;
	else return 0; */
	
	}
}