abstract class Abs1
{
	void m2()
	{
		System.out.println("Abs1 class2 method");
	}

	void m3() {
		// TODO Auto-generated method stub
		
	}
}





public class Abs extends Abs1  {
	public void m1(){
		System.out.println("Abs m1 method");
	}
	@Override
	void m3()
	{
		System.out.println("Welcome");
	}
	
	
	public static void main(String[] args) {
	Abs a=new Abs();
	a.m1();
	a.m2();
	a.m3();
}

	
}
