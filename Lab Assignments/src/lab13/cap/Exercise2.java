package lab13.cap;

@FunctionalInterface
 interface Interface2 {
	public void space(String s);
}
public class Exercise2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Interface2 sat = (s)->{System.out.println(s.replace("", " "));};
			sat.space("Ahana");
		}


}
