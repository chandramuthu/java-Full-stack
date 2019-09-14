
public class AutoBoxingDemo {
public static void main(String[] args) {
	int a=10;
	System.out.println("value of a is: "+a);
	Integer a1=new Integer(a);
	a1.valueOf(a);  //Boxing
	System.out.println("value of a1 is: "+a1);
	Integer a2=a;  // Auto Boxing
	System.out.println("value of a2 is: "+a2);
	
	
	Integer i=new Integer(20);
	int x=i.intValue(); //unboxing
	System.out.println("value of x is: "+x);
	
	int y=i; //auto unboxing
	System.out.println("value of y=: "+y);
}
}
