import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateStringTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String[]  values={"dgdfgh","gfhgfh","hfghfgh","ytrydhf","hgfhdf","gfhgfhgfh"};
	Predicate<String> pre=i->(i.length()%2==0);
	for(String s:values)
	{
		if(pre.test(s))
		{
			System.out.println(s);
		}
	}
}
}
