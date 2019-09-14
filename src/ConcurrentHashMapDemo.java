




import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

 

public class ConcurrentHashMapDemo extends Thread
{
    static ConcurrentHashMap chm= new ConcurrentHashMap();
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Child");
        chm.put(40, "Welcome to ibm");
    }
    public static void main(String[] args) throws InterruptedException{
        chm.put(10, "Welcome ");
        chm.put(20, "Hellow");
        chm.put(30, "hai");
        //System.out.println(chm);
        ConcurrentHashMapDemo t=new ConcurrentHashMapDemo();
        t.start();
        Set s=chm.keySet();
        Iterator itr = s.iterator();
        Integer i = (Integer) itr.next();
        System.out.println("");
    System.out.println("current key is="+i+ "and value"+chm.get(i));
    Thread.sleep(2000);
    System.out.println(chm);
    }
}