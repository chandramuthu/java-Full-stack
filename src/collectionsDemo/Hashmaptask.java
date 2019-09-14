package collectionsDemo;

import java.util.HashMap;
import java.util.Scanner;

class Employee12 
{
	String name;
	String add;
	int sal;
	public Employee12(String name, String add, int sal) {
		super();
		this.name = name;
		this.add = add;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "name=" + name + ", add=" + add + ", sal=" + (sal+10000)+"\n";
	}
	 }

public class Hashmaptask {
public static void main(String[] args) {
	
	System.out.println("Enter Mobile Number");
	Scanner sc=new Scanner(System.in);
	long num;
	num=sc.nextLong();
	HashMap<Long, Employee12> m=new HashMap<Long, Employee12>();
	
	Employee12 e1=new Employee12("Chandru","Bangalore",20000);
	Employee12 e2=new Employee12("Muthu","Madurai",65585);
	Employee12 e3=new Employee12("Naveen","Vijaynagar",2545411);
	Employee12 e4=new Employee12("Navu","rajajinagar",545452 );
	Employee12 e5=new Employee12("Vasanth","Bidadi",56544);
	Employee12 e6=new Employee12("Dhanraj","Vidyaranyapura",544564 );
	
	
	m.put(1234567890l, e1);
	m.put(9866502069l, e2);
	m.put(9676565632l, e3);
	m.put(9966502069l, e4);
	
	Employee12 e=m.get(num);
	e.sal+=10000;
	System.out.println(e.sal);
	System.out.println(e);
	System.out.println(m);
}
}
