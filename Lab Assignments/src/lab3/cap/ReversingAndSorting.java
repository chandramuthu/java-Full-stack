package lab3.cap;

import java.util.Arrays;

public class ReversingAndSorting {
	public int[] reversingAndSorting(int arr[]){
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		ReversingAndSorting ras = new ReversingAndSorting();
		int arr[] = {16,67,43,12,11};
		
		arr = ras.reversingAndSorting(arr);
		System.out.println();
		for(int i:arr){
			System.out.print(i+" ");
		}

	}

}
