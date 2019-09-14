package MultiThreadingDemo;
class First
{
	public synchronized void Display(String msg) throws Exception
	{
		System.out.println("["+msg);
		Thread.sleep(1000);
		System.out.println("]");
	}
}

	
	class Test21 extends Thread
	{
 String msg;
 Test111 Fobj;
public Test21(String msg, Test111 fobj) {
	super();
	this.msg = msg;
	Fobj = fobj;
	this.start();
	public void run()
	{
		fobj.Display
	}
}
	}
 
	
	public class MultiThreadDemo3 {
	public static void main(String[] args) {
		First f=new First();
		Test111 t=new Test111();
		t.start();
		Test21 t2=new Test21();
		t2.start();
		for(long i=0;i<99999l;i++)
		{
			if(i==1221l)
			{
			System.out.println(i);
			System.out.println(Thread.currentThread().getPriority());
			}
		}
		
	}
	}
