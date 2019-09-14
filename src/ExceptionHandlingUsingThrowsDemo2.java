
class MyException1 extends Exception
{
	public MyException1(String errormsg)
	{
		super(errormsg);
	}
}
public class ExceptionHandlingUsingThrowsDemo2 
{
	static void validation1(String age1) throws MyException1
	{
		if(age1=="CM")
		{
			throw new MyException1("You have typed invalid name");
		}
		else
		{
			System.out.println("Valid Name");
		}
	}
public static void main(String[] args) throws MyException1
{
	ExceptionHandlingUsingThrowsDemo2.validation1("CM");
	System.out.println("Rest of the code is being executed");
}
}
