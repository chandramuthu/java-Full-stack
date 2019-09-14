import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) throws IOException {
	File f=new File("Arjun.txt");
	f.createNewFile();
	System.out.println("Created the fILE Arjun.txt");
}
}
