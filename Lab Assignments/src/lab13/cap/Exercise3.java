package lab13.cap;

 interface Interface3 {
	public boolean test(String x,String y);
}
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface3 i3 = (name,pass)->{if(name=="Ahana"&&pass=="Das") return true;else return false;};
		boolean b = i3.test("Diya", "Pc");
		System.out.println(b);
	}


}
