
public class ExceptionHandlingDemo {
public static void main(String[] args) {
	try{
		int a[]=new int[5];
		a[4]=30/5;
		String s="1234";
		int x=Integer.parseInt(s);
		System.out.println("length is: "+s.length());
		System.out.println(+x);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array size is exceeded");
	}
	catch (ArithmeticException e) {
	System.out.println("Denominator cannot be zero");	// TODO: handle exception
	}
	catch (NumberFormatException e) {
		System.out.println("Number format exception");
		// TODO: handle exception
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	catch (Exception e) {
System.out.println("Invalid program");		// TODO: handle exception
	}
	
	finally {
		System.out.println("Program executed");
	}
	System.out.println("Remaining lines of code");

	
}
}
