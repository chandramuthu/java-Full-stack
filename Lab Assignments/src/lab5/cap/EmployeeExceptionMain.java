package lab5.cap;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeExceptionMain {
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee salary:");
		int salary=sc.nextInt();
		try {
		if(salary<3000){
				throw new EmployeeException("Salary should be above or equal to 3000");
			}} catch(EmployeeException e) {
				System.err.println(e.getMessage());
			}
		


	}

}
