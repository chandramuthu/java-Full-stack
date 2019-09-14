package lab4.cap;

import java.util.Scanner;

public class CubesOfDigits {
	static int n,sum=0;
	static void getcube(int num)
	{
		while(num>0)
		{
			n=num%10;
			sum+=(n*n*n);
			num=num/10;
		}
		System.out.println("The sum of the cubes of the digits  is: "+sum);
	}
	public static void main(String[] args) {
		System.out.print("Enter the digit:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		CubesOfDigits.getcube(num);	
	}

}