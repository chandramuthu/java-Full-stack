package MultiThreadingDemo;
class Test implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		char ch;
		for (ch = '*'; ch <= '5'; ch++)
		{
		System.out.println(ch);
		
	}}
	
}
public class MultiThreading1 {
public static void main(String[] args) {
	Test t=new Test();
	Thread th=new Thread(t);
	th.start();
	for(int i=0;i<100;i++)
	{
		
		System.out.println("Parent Thread");
	}
}
}
