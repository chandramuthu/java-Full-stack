import java.util.Scanner;
class Exam
{
  
  public static void main(String[] args) 
  {
	  Exam e=new Exam();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Content to add in the String array");
	int n=sc.nextInt();
	
	System.out.print("Enter the Contents");
	String[] s = new String [10];
for(int j=0;j<n+1;j++) 
	{
	s[j+1] = sc.nextLine();
	}
	for(int i=1;i<n+2;i++)
	{
	System.out.print(s[i]+"*  ");
	}
	sc.close();
}
}

