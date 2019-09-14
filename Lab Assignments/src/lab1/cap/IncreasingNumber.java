package lab1.cap;

import java.util.Scanner;

class Test2{
	boolean checkNumber(int number) {
		
	       boolean flag = false;
	         
	       int currentDigit = number % 10;
	       number = number/10;
	        
	       while(number>0){
	           if(currentDigit < number % 10){
	        	  
	               flag = true;
	               break;
	           }
	           currentDigit = number % 10;
	           number = number/10;
	       }
	        
	       if(flag){
	           System.out.println("Digits are not increasing number.");
	       }else{
	           System.out.println("Digits are  increasing number.");
	}
		return flag;
}
}

public  class IncreasingNumber {
	public static void main(String[] args) {
			Test2 obj=new Test2();
			System.out.println("Enter a number : ");
			Scanner scanner = new Scanner(System.in);
	        
		       int number = scanner.nextInt();
		
		obj.checkNumber(number);
	}
}



