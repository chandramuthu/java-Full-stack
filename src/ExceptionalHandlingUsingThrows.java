
class MyException1 extends Exception
{
	public MyException1(String errormsg)
	{
		super(errormsg);
	}
}
public class ExceptionalHandlingUsingThrows 
{
	static void validation(int age1) throws MyException1
	{
		if(age1<18)
		{
			throw new MyException1("you are not eligible to vote");
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
	}
public static void main(String[] args) throws MyException1
{
	ExceptionalHandlingUsingThrows.validation(18);
	System.out.println("Rest of the code is being executed");
}
}
