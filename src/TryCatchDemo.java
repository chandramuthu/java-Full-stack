import java.util.Scanner;
import java.util.regex.Matcher;

public class TryCatchDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 2 Values");
	int a1=sc.nextInt();
	int a2=sc.nextInt();
	try
	{
	float a3=a1/a2;
	System.out.println("Answer is"+a3);
	}	
	
	catch(ArithmeticException ae)
	{
		System.out.println("Exception is thrown");
	}
	System.out.println("Program Executed");
	sc.close();
}
}
