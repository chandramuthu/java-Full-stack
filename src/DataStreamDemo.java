import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("hello.txt");
	DataOutputStream dos=new DataOutputStream(fos);
	dos.writeInt(10);
dos.writeUTF("vineet");
DataInputStream dis=new DataInputStream(new FileInputStream("hello.txt"));
System.out.println("Int:  "+dis.readInt());
System.out.println("String:  "+dis.readUTF());
dos.close();
dis.close();
}
}
