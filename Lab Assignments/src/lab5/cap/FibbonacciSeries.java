package lab5.cap;



	import java.util.Scanner;


	public class FibbonacciSeries 
	{
	    public static void main(String[] args) {
	        int a=1;
	        int b=0;
	        int num,c;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the number:");
	        num=s.nextInt();
	        for(int i=1;i<=num;i++){
	            c=a+b;
	            System.out.println(c);
	            a=b;
	            b=c;
	        }
	        s.close();
	    }


	 
	}
	 








