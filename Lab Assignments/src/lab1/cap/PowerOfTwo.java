package lab1.cap;

import java.util.Scanner;

class Test3{
	void checkNumber(){
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	
	
	int num = scanner.nextInt() ;
	int d;
	boolean flag = true;
	while(num>1)
	{
	d = num % 2;
	if(d%2!=0)
	{
	flag = false;
	break;
	}
	num = num/2;

	}
	if(flag == true)
	{
	System.out.println("Number is a power of 2");
	}
	else
	{
	System.out.println("Number is not a power of 2");
	}

	}

}

public class PowerOfTwo {
	public static void main(String[] args) {
		Test3 obj=new Test3();
		obj.checkNumber();
	}

}
