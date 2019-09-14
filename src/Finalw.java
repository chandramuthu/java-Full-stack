
class venny{
	static int a=10;
	 static void m1()
	{
		System.out.println("M1 class it is");
		a=a+1;
		System.out.println("Num  "+a);
	}
	static void m2()
	{
		System.out.println("M2 Class it is");
		a=a-1;
		System.out.println("num  "+a);
	}
}


public class Finalw extends venny {
	static void m1()
	{
		System.out.println("M1 Class is Over ridded");
		a=a-1;
		System.out.println("num  "+a);
	}
	
public static void main(String[] args) {
	Finalw w=new Finalw();
	venny.m1();
	venny.m2();
	w.m1();
	venny m=new venny();
	m.m1();
}
}






