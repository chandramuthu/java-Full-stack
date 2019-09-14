package FunctionalInterface;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class FunctionInterfaceDemo 
{
    public static void main(String[] args) 
    {
        //Double Function
        DoubleFunction f=i->i*2;
        System.out.println(f.apply(3));
        System.out.println();
        //Long Function
        LongFunction f1=i->i*3;
        System.out.println(f1.apply(3));
        System.out.println();
        //Int Function
        IntFunction f2=i->i*2;
        System.out.println(f2.apply(2));
        System.out.println();
        //DoubleToIntFunction
        DoubleToIntFunction f3=i->(int)i*8;
        System.out.println(f3.applyAsInt(2D));
        System.out.println();
        //DoubleToLongFunction
        DoubleToLongFunction f4=i->(long)i*2*3;
        System.out.println(f4.applyAsLong(2L));
        System.out.println();
        //IntToDoubleFuntion
        IntToDoubleFunction f5=i->i*8;
        System.out.println(f5.applyAsDouble(3));
        System.out.println();
        //IntTOLongFunction
        IntToLongFunction f6=i->i*9;
        System.out.println(f6.applyAsLong(5));
        System.out.println();
        //LongToIntFunction
        LongToIntFunction f7=i->(int)i*7;
        System.out.println(f7.applyAsInt(4));
        System.out.println();
        //LongToDoubleFunction
        LongToDoubleFunction f8=i->(double)i*8;
        System.out.println(f8.applyAsDouble(2));
        System.out.println();
        //ToIntFunction
        ToIntFunction f9=i->(int)i*5;
        System.out.println(f9.applyAsInt(2));
        System.out.println();
        //ToLongFunction
        ToLongFunction<Integer> f10=i->(int)i*2;
        System.out.println(f10.applyAsLong(2));
        System.out.println();
        //or
        ToLongFunction<String> f11=i->(Long.parseLong(i))*2;
        System.out.println(f11.applyAsLong("2"));
        System.out.println();
        //ToDoubleFunction
        ToDoubleFunction<String> f12=i->Double.parseDouble(i)*2;
        System.out.println(f12.applyAsDouble("2"));
        System.out.println();
        //ToIntBiFunction
        ToIntBiFunction<String, Integer> f13=(x,y)-> Integer.parseInt(x)+Integer.parseInt(x);
        System.out.println(f13.applyAsInt("2", 2));
        System.out.println();
        //ToLongBiFunction
        ToLongBiFunction<Integer, Long> f14=(x1,y1)->Long.parseLong(x1)+Long.parseUnsignedLong()));
        System.out.println(f14.applyAsLong(2, 2L));
        System.out.println();
        //ToDoubleBiFunction
        ToDoubleBiFunction<String,String>f15=(x2,y2)->Double.parseDouble(x2)+Double.parseDouble(y2);
        System.out.println(f15.applyAsDouble("3", "4"));
        System.out.println();
    }
}