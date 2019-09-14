package lab3.cap;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest{
	
	   int getSecondSmallest(int[] a)
		{
		Arrays.sort(a);
		System.out.println("The second smallest element in the array is..");
		return a[1];	 
		}

		public static void main(String[] args) 
		{

			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the size of an array..");
				int size=sc.nextInt();
				
			 System.out.println("Enter the elements for the array..");
				int a[]=new int[size];
				int i=0;
				
				for( i=0;i<size;i++)
				{
					 a[i]=sc.nextInt();
				} 	
				
			sc.close();
			SecondSmallest s=new SecondSmallest();
			System.out.println(s.getSecondSmallest(a));
		
		}

	}