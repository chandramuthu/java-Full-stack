package lab5.cap;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count;
        for(int i=1;i<=num;i++)
        {
        count=0;
            for(int j=2;j<=i/j;j++)
            {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }
    }

 

}
 