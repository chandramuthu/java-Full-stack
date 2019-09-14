
public class Arjun {
	public Arjun() {
	System.out.println("Constructor executed successfully");	// TODO Auto-generated constructor stub
	}
	public Arjun(String s) {
		System.out.println("parameter Constructor executed successfully  "+s);	// TODO Auto-generated constructor stub
		}
	public Arjun(int a,int b) {
		System.out.println("Multiple parameter Constructor executed successfully  "+(a+b));	// TODO Auto-generated constructor stub
		}
    void m1(){
    	System.out.println("method 2");
    }
public static void main(String[] args) {
	Arjun a=new Arjun();
	a.m1();
	Arjun a1=new Arjun("Chandru");
	Arjun a2=new Arjun(10,20);

}
}