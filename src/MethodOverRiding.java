class venn{
	static void m1()
	{
		System.out.println("M1");
	}
	static void m2()
	{
		System.out.println("M2");
	}
}




public class MethodOverRiding extends A
{
	static void m3()
	{
		System.out.println("M3");
	}
	static void m2()
	{
		System.out.println("M5");
	}
	
public static void main(String[] args) {
	MethodOverRiding.m2();
	venn.m1();
	venn.m2();
	MethodOverRiding.m3();
	
}
}
