
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo extends Thread {
	static CopyOnWriteArrayList al = new CopyOnWriteArrayList();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child Thread updating AL");
		al.add("C");
	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		CopyOnWriteArrayListDemo ca = new CopyOnWriteArrayListDemo();
		ca.start();
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			String values = (String) itr.next();
			System.out.println("MainThread al values:" + values);
		}
		System.out.println(al);

		CopyOnWriteArrayList cowa = new CopyOnWriteArrayList();
		cowa.add("A");
		cowa.addIfAbsent("B");
		System.out.println(cowa);

		cowa.addAllAbsent(al);
		System.out.println(cowa);

		ArrayList al1 = new ArrayList();
		al1.add("X");
		al.add("Y");
		al.add("Z");
		System.out.println("al1: " + al1);

		cowa.addAllAbsent(al1);

		System.out.println("cowal: " + cowa);
	}
}

