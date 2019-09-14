class One{
     One()
	{
		System.out.println("one default constructor"); 
	}
	 One(int x)
	{
		System.out.println("one Paramenterised  constructor with value X as "+x); 
	}
}


public class Childc extends One
{
	 Childc()
	{
		 super();
		 //here instead of Child c if i write this, its showing Error.
		System.out.println("one default constructor");
		
		
	}
	 Childc(int x)
	{
		System.out.println("one Paramenterised  constructor with value X as "+x); 
	}
public static void main(String[] args) 
{
	
	Childc c=new Childc(10);
	
	
	
}
}
