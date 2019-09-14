package lab5.cap;


import java.util.Scanner;


public class TrafficLight {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose one color:\n 1 for Red \n 2 for Yellow \n 3 for Green ");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:System.out.println("STOP");
            break;
            
            case 2:System.out.println("WAIT");
            break;
            
            case 3:System.out.println("GO");
            break;


        }
        


    }


}
 








