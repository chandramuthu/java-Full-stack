package lab5.cap;

import java.util.Scanner;

class Exception22 extends Exception 
{   private int age;

 Exception22(int age1)
	 {
		 this.age=age1;
	 }
	 public String toString(){
		 return "\nValidation is succesful" + "Your age is above 15" ;
	 }
}
public class AgeValidation
{
	 static void validation(int age1) throws Exception22
	 {
		 if(age1<15)
		 {
			 throw new Exception22(age1);
		 }
		 else
		 {
			 System.out.println("\nValidation is succesful" + "Your age is above 15");
		 }
	 }
	 public static void main(String[] args) throws Exception22{
		 System.out.println("Enter your age");
		 Scanner scanner=new Scanner(System.in);
		 int n=scanner.nextInt();
		AgeValidation.validation(n);
		
	}
}

