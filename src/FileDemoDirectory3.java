import java.io.File;
import java.io.IOException;

public class FileDemoDirectory3 {
public static void main(String[] args) throws IOException {
	File f=new File("Capgi/Myfile.txt");
	f.getParentFile().mkdir();
	f.createNewFile();
	System.out.println("Directory and file created");
}
}
