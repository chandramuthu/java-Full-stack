class A{
	static void add()
	{
		System.out.println("Default Constructor");
	}
	static void add(int a,int b)
	{
		System.out.println("Added Value is:  "+(a+b));
	}
	static void add(int a,float b)
	{
		System.out.println("Added Value is:  "+(a+b));
	}
	static void add(long a,int b)
	{
		System.out.println("Added Value is:  "+(a+b));
	}
	static void add(float a,float b)
	{
		System.out.println("Added Value is:  "+(a+b));
	}
}




public class MethodOverloading {

	
	
public static void main(String[] args) {
	A.add();
	A.add(10,20);
	A.add(100f,200f);
	A.add(1000,2000f);
	A.add(999999999,20000);

}
}
