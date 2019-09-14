package lab13.cap;

import java.util.function.Function;

public class Exercise5 {
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		else 
			return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer,Integer> fac = Exercise5::factorial;
		boolean b = fac.apply(5).equals(120);
		System.out.println(b);
	}

}
