package LambdaWithCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassWithLambda {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(50);
	al.add(65);
	System.out.println(al);
	List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	//	ArrayList<Integer> l=(ArrayList<Integer>) al.stream().filter(i->i%2==0).collect(Collectors.toList());
	//one more type
	System.out.println("Filter to print Even Numbers only "+l);
	System.out.println("map to print Double values");
	List<Integer> l1=al.stream().map(i->i*2).collect(Collectors.toList());
	System.out.println("Printing Double Values : "+l1);
	List<Integer> l2=al.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?+1:0).collect(Collectors.toList());
	System.out.println("Sorted Ascending  Order "+l2);
	List<Integer> l3=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
	System.out.println("Sorted Decending  Order "+l3);
	Integer minValue=al.stream().min((i1,i2)->-i2.compareTo(i1)).get();
	System.out.println("Minimum Value "+minValue);
	Integer maxValue=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println("Maximum Value "+maxValue);

	
}
}
