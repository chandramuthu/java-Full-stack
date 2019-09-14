package MultiThreadingDemo;

 

class First1{
    public synchronized void display(String msg)
    {
        System.out.print("[" + msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
class Second1 extends Thread{
    String msg;
    First1 fobj;
    Second1(First1 fobj,String msg){
        this.fobj=fobj;
        this.msg=msg;
        this.start();
    }
    public void run(){
        fobj.display(msg);
    }
}
public class ThreadWithSyncronized
{
    public static void main(String[] args) {
        First1 fnew=new First1();
        Second1 ss=new Second1(fnew,"welcome");
        Second1 ss1=new Second1(fnew,"new");
        Second1 ss2=new Second1(fnew,"java programmer");
        }
}