package lab1.cap;

import java.util.Scanner;

public class DiffNatural{

	int calculateDifference(int n){
		int sum,sumOfSq=0,sqOfSum=0;
		for(int i=0;i<=n;i++)
		{
		 sumOfSq+=(i*i);
		 sqOfSum+= i;
		}
		sum=(sumOfSq - (sqOfSum*sqOfSum));
		System.out.println("The Differnce between the sum of the squares of the first n natural numbers and the square of their sum are:"+sum);
		return sum;
		}
		public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		DiffNatural obj=new DiffNatural();
		obj.calculateDifference(n);// Calling calculateDifference method
		sc.close();
	}

}
