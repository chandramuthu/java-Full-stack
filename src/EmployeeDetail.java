import java.util.Scanner;

public class EmployeeDetail {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name");
	String name=sc.next();
	name+=sc.nextLine();
	System.out.println("Enter the Employee ID");
	int ID=sc.nextInt();
	System.out.println("Enter the Phone Number");
	long Num=sc.nextLong();
	System.out.println("Enter the Lab Number");
	int lab=sc.nextInt();
	System.out.println("Name =  "+name);
	System.out.println("Employee ID =  "+ID);
	System.out.println("Mobile No. =  "+Num);
	System.out.println("Lab No. =  "+lab);
	sc.close();
	
}
}
