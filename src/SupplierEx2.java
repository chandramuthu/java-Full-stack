import java.sql.Date;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SupplierEx2 {
    public static void main(String[] args) {
        Supplier<String> sup=()->{  //Supplier
            String otpNum="";
            for(int i=0;i<6;i++)
            {
            otpNum=otpNum+(int)(Math.random()*10);
            }
        return otpNum;
        };
        System.out.println(sup.get());
        
        BooleanSupplier bsup=()->true;    //Boolean Supplier
        System.out.println(bsup.getAsBoolean());
        
        int x=31,y=21;
        bsup=()->x<y;
        System.out.println(bsup.getAsBoolean());
        
        Supplier<Date> sup1=()-> new Date(0);  //Supplier
        System.out.println(sup1.get());
    }

 

}