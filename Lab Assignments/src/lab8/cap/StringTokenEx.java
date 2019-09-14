package lab8.cap;


import java.util.StringTokenizer;

	 

	public class StringTokenEx {	 
		public static void main(String[] args) {
	    
	    int sum = 0;
	    String a="1/0/0/8/1/9/9/8";
	    StringTokenizer str=new StringTokenizer(a,"/");
	     while (str.hasMoreTokens()) {
	         String temp = str.nextToken();
	         int n = Integer.parseInt(temp);
	         System.out.println(n);
	         sum = sum + n;
	         
	     }
	     System.out.println("sum="+sum);
	}
	}
	 


