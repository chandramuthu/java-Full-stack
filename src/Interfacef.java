 interface Abs12
{
	void m2();
	void m3();
}
	

public class Interfacef implements Abs12  {
	public void m1(){
		System.out.println("Abs m1 method");
	}
	@Override
	public void m3()
	{
		System.out.println("Welcome to method m3");
	}
	@Override
	public void m2()
	{
		
	}
	public static void main(String[] args) {
	Interfacef a=new Interfacef();
	a.m1();
	a.m2();
	a.m3();
}
}
