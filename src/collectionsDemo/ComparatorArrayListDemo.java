package collectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
class Emp implements comparable{
	int eid;
	String aname;
	int sal;
	public Emp(int eid, String aname, int sal) {
		super();
		this.eid = eid;
		this.aname = aname;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "eid=" + eid + ", aname=" + aname + ", sal=" + sal;
	}
}


public class ComparatorArrayListDemo {
	public static void main(String[] args) {
		Emp e2=new Emp(103,"Vijay",10000);
	Emp e3=new Emp(104,"Bala",100000);
		Emp e=new Emp(101,"Suresh",100);
		Emp e1=new Emp(102,"Ramesh",1000);

	
		ArrayList a=new ArrayList();
		
		a.add(e);
		a.add(e1);
		a.add(e2);
		a.add(e3);
	System.out.println(a);
		
		}
}
