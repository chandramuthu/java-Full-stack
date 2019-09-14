package MultiThreadingDemo;
class Account{
	int balance;

	public Account() {
		
		balance = 5000;
	}
	
	public synchronized void withdraw(int bal) throws InterruptedException
	{

		Thread.sleep(1000);
		balance=balance-bal;
		System.out.println("Amount Withdrawn"+bal);
		System.out.println("Current Balance"+balance);
	}
	public synchronized void deposit(int bal) throws Exception
	{

		Thread.sleep(1000);
		balance=balance+bal;
		System.out.println("Amount Deposited"+bal);
		System.out.println("New Balance"+balance);
	}
	public synchronized void enquiry() throws Exception
	{
		Thread.sleep(1000);
		System.out.println("Final Balance"+balance);
	}
	
}
class Transaction implements Runnable
{
	Account obj;

	Transaction(Account a)
	{
		
		obj = a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			obj.deposit(500);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			obj.withdraw(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			obj.enquiry();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


public class ThreadBankClass {
public static void main(String[] args) {
	Account a=new Account();
	Transaction w=new Transaction(a);
	Thread t1=new Thread(w);
	Thread t2=new Thread(w);
	t1.start();
	t2.start();
	
	
}
}
