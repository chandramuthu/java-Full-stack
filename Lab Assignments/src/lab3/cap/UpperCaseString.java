package lab3.cap;



	import java.util.Arrays;
	import java.util.Scanner;

	 

	//import string.SortingString;

	 

	public class UpperCaseString 
	{
	    String[] sortString(String[] a) {

	 

	        String[] b = new String[a.length];
	        Arrays.sort(a);

	 

	        int l = a.length;
	        int div = l / 2;
	        if (l % 2 == 0) {
	            for (int i = 0; i < l; i++) {

	 

	                if (i < div) {
	                    b[i] = a[i].toUpperCase();
	                } else {
	                    b[i] = a[i].toLowerCase();
	                }
	            }
	        } else {
	            for (int i = 0; i < l; i++) {

	 

	                if (i < div + 1) {
	                    b[i] = a[i].toUpperCase();
	                } else {
	                    b[i] = a[i].toLowerCase();
	                }
	            }
	        }

	 

	        return b;
	    }

	 

	    public static void main(String[] args) {
	    	UpperCaseString  s = new UpperCaseString ();

	 

	        System.out.println("enter a number:");

	 

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	 

	        System.out.println("enter the strings:");
	        String a[] = new String[n];

	 

	        for (int i = 0; i < n; i++) {
	            a[i] = sc.next();

	 

	        }
	        String[] c = s.sortString(a);
	        for (int i = 0; i < c.length; i++) {
	            System.out.println(c[i]);
	        }
	        sc.close();
	    }
	}