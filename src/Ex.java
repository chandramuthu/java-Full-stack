import java.util.Scanner;
class Ex
{
  
  public static void main(String[] args) 
  {
	  Ex e=new Ex();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Content to add in the String array");
	int n=sc.nextInt();
	
	System.out.println("Enter the Contents");
	String[] s = new String [n];



	for(int j = 0; j <n;j++) 
	{
	

	s[j] = sc.nextLine();
	}
	for(int i=0;i<n;i++)
	{
	System.out.print(s[i]+"*  ");
	}
	sc.close();
}
}

