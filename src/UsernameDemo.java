
import java.io.IOException;
import java.util.Scanner;

public class UsernameDemo {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter User Name: ");
	String s1=new String();
	s1=sc.next();
	System.out.println("enter Pasword: ");
	String s2=new String();
	s2=sc.next();
	if(s1.equals("Capgemini") && s2.equals("Capgemini123"))
	{
		System.out.println("Login Successful");
	}
	else
	{
		System.out.println("Login Failed");
	}
	
	sc.close();
}
}
