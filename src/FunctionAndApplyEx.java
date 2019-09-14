import java.util.function.Function;

public class FunctionAndApplyEx {
public static void main(String[] args) {
	
		    Function<Integer,Integer> f=i-> 2*i;
		    Function<Integer,Integer> f1=i-> (i*i*i);
		    System.out.println(f.apply(3));
		    System.out.println(f.andThen(f1).apply(2));
		    System.out.println(f.compose(f1).apply(2));
		}
		}

