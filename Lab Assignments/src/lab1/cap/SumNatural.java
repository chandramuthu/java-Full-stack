package lab1.cap;

import java.util.Scanner;

class Test{
	
	int calculateSum(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	 int sum=0;
	 
	 for(int i=0;i<=n;i++){
		 if(i%3==0 || i%5==0 ){
			 sum=sum+i;

		 }
		 
		 		 }
	System.out.println("ADDITION =" + sum);
	return sum;
}
	
}

public class SumNatural {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.calculateSum();
		
	

}
}

