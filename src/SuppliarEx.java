import java.util.function.Supplier;

public class SuppliarEx {
public static void main(String[] args) {
	Supplier<String> sup=()->{
		String optnum="";
		for(int i=0;i<6;i++)
		{
			optnum=optnum+(int)(Math.random()*10);
		}
		return optnum;
	};

	for(int j=0;j<10;j++)
	System.out.println(sup.get());
}
}
