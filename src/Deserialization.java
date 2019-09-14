import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String[] args) throws IOException, Exception
{
	FileInputStream fis=new FileInputStream("New.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	ObjectStreamDemo st=(ObjectStreamDemo)ois.readObject();
	System.out.println(st.getSno());
	System.out.println(st.getName());
	System.out.println(st.getAdno());
	
	}
}
