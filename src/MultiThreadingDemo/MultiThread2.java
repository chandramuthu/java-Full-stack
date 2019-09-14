package MultiThreadingDemo;
class Test1 extends Thread
{

	@Override
	public void run() {

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		System.out.println("prior"+Thread.currentThread().getPriority());
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
	}
	}
	
}
class Test2 extends Thread
{

	@Override
	public void run() {

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);


		System.out.println("prior"+Thread.currentThread().getPriority());	
		for(int i=11;i<20;i++)
	{
		System.out.println(i);
	}
	}
	
}
public class MultiThread2 {
public static void main(String[] args) {
	Test1 t=new Test1();
	t.start();
	Test2 t2=new Test2();
	t2.start();
	for(long i=2000000;i<999999999999999999l;i++)
	{
		if(i==199999999999999l)
		{
		System.out.println(i);
		System.out.println(Thread.currentThread().getPriority());
		}
	}
	
}
}
