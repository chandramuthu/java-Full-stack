import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UsernameWithBufferReader {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter User Name: ");
	String s1=new String();
	s1=sc.next();
	System.out.println("enter Pasword: ");
	String s2=new String();
	s2=sc.next();
	
	
	FileReader f=new FileReader("Jam1.txt");
	BufferedReader b=new BufferedReader(f);
	String line1=b.readLine();
	String line2=b.readLine();
	if(s1.equals(line1) && s2.equals(line2))
	{
		System.out.println("Login Successful");
	}
	else
	{
		System.out.println("Login Failed");
	}
	
	sc.close();
	b.close();
}
}
