package collectionsDemo;

import java.io.Serializable;
import java.util.PriorityQueue;

public class QueueDemo1 {
public static void main(String[] args) {
	PriorityQueue e=new PriorityQueue();
	e.add(10);
	e.add(20);
	e.add(1254);
	e.add(254);
	e.add(7454);
	e.add(877812);
	PriorityQueue<Integer> e1=new PriorityQueue<Integer>();
	e1.add(10);
	e1.add(20);
	e1.add(1254);
	e1.add(254);
	e1.add(7454);
	e1.add(877812);
	System.out.println(e.containsAll(e1));
	System.out.println(e.contains(20));
	System.out.println(e.peek());
	System.out.println(e.poll());
	System.out.println(e.offer(15));
	System.out.println(e.size());
	System.out.println(e.addAll(e1));
	System.out.println(e);
}
}
