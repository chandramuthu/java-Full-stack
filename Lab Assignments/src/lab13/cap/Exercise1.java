package lab13.cap;

@FunctionalInterface
 interface Power {

	public double power(int x,int y);
}
public class Exercise1 {
	
	public static void main(String[] args) {
	
		Power i1 = (x,y)->{return Math.pow(x,y);};
		System.out.println("4 to the power 5 is "+i1.power(4, 5));
	}

}
