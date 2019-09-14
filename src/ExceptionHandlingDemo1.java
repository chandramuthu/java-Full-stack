
public class ExceptionHandlingDemo1 {
public static void main(String[] args) {
	try{
		int a=36/0;
		try{
			int b []= new int[5];
			b[4]=10;
		}
	
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Inner Catch 1 Exception");
	}
		try
		{
			System.out.println("Division");
			int x=10/2;
			
		}
		catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println("Inner Class catch 2 Exception");// TODO: handle exception
		}
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.println("Outer Class Catch1 exception");// TODO: handle exception
	}
	System.out.println("Executing rest of lines of code");
}
}