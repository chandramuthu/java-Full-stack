package collectionsDemo;

import java.util.TreeSet;
import java.util.*;

class Employee1 implements Comparable
{
	String name;
	int eid;
	 Employee1(String name, int eid) {
     this.name=name;
     this.eid=eid;
	 }
public String toString()
{
	return name+"---"+eid;
}
 public int compareTo(Object obj1)
 {
	 int eid=this.eid;
	 Employee1 e=(Employee1)obj1;
	 int eid2=e.eid;
	 if(eid<eid2)
		 return +1;
	 else if(eid>eid2)
		 return -1;
	 else
		 return 0;
 }
}

class MyComparator10 implements Comparator{
    public int compare(Object obj1, Object obj2)
    {
        Employee1 e1=(Employee1) obj1;
        Employee1 e2=(Employee1) obj2;
        String s1=e1.name;
        String s2=e2.name;
        return s1.compareTo(s2);
        
    }
 }


public class ComparatorExployeeDemoFinal {
public static void main(String[] args) {
	Employee1 e1=new Employee1("Rajesh", 100);
	Employee1 e2=new Employee1("Suresh", 200);
	Employee1 e3=new Employee1("Vijay", 20);
	Employee1 e4=new Employee1("Yuvraj", 5000);
	Employee1 e5=new Employee1("Meghana", 20000);
	TreeSet t=new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
	TreeSet t1=new TreeSet(new MyComparator10());
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);
	System.out.println(t1);
	
}
}
