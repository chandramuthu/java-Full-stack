package lab5.cap;

import java.util.Scanner;

class NameNotValid extends Exception
{
	public NameNotValid(String errMsg) 
	{
		super(errMsg);	
		
	}
}
class NameCheck
{
	void check(String fname,String lname) throws NameNotValid
	{
		if((fname.length()==0) && (lname.length()==0))
		{
			throw new NameNotValid("Your name is empty \n Please enter the name properly");
		}
		else
		{
			System.out.print("Your Fullname is: "+fname+" "+lname);
		}
				
	}
}
public class NameValidation {

	public static void main(String[] args) throws NameNotValid {
		
		NameCheck obj=new NameCheck();
		obj.check("","");
	}

}
