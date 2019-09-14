package lab3.cap;

import java.util.Scanner;



public class CountChar {
    int i=0;
    int sum = 0;
    void count(char letter[])
    {
        
        for(int i=0;i<letter.length;i++)
        {
            sum=0;
            for (int j =0; j < letter.length; j++)
            {
//                System.out.println(letter[i]+" "+letter[j]);
                
                if(letter[i]==letter[j])
                {
                    
                    sum=sum+1;
                    //System.out.println(sum);
                }
                
            }System.out.println(letter[i]+" = "+sum);
            
            
            
        }
        //return sum;
        
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Char values: ");
        char letter[]=new char[5];
        for(int i=0;i<letter.length;i++)
        {
            letter[i]=sc.next().charAt(0);
        }
        
        CountChar cc=new CountChar();
        cc.count(letter);
    }
}
 