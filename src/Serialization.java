import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class ObjectStreamDemo implements Serializable {
	 private int sno;
		private String name;
		private String adno; 
	 public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdno() {
		return adno;
	}
	public void setAdno(String adno) {
		this.adno = adno;
	}
 }
 public class Serialization
 {
public static void main(String[] args) throws IOException {
	ObjectStreamDemo s=new ObjectStreamDemo();
	s.setSno(1001);
	s.setName("Chandru");
s.setAdno("Bangalore");
FileOutputStream fos=new FileOutputStream("New.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s);
System.out.println("Success!!!");
oos.close();
	
}
}
