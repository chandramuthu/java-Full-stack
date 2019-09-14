
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayList extends Thread
{
    static CopyOnWriteArraySet con= new CopyOnWriteArraySet();
    @Override
    public void run() 
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Child Thread updating Array Set");
        con.add("C");
    }
    public static void main(String[] args) throws InterruptedException 
    {
        con.add("A");
        con.add("B");
        CopyOnWriteArrayList rx=new CopyOnWriteArrayList();
        rx.start();
        Iterator itr=con.iterator();
        while(itr.hasNext())
        {
            String values=(String) itr.next();
            System.out.println("Main Thread Executing...."+values);
            Thread.sleep(1000);
            System.out.println(con);
        }
    }
}