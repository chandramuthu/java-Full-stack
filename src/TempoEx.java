import java.util.*;
import java.util.function.Predicate;

public class TempoEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		// int a[];
		System.out.println("Enter Index of array");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
//		System.out.print("The even Elements are: ");
//		for (int j = 0; j < n; j++) {
//			if (a[j] % 2 == 0) {
//
//				System.out.print(+a[j] + "  ");
//			}
//		}
	Predicate<Integer> pre=i->i%2==0;
	for(int val:a)
	{
		if(pre.test(val))
		{
			System.out.println(val);
		}
	}
	

	}
}
