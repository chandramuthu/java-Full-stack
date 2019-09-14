import java.io.File;
import java.io.IOException;

public class FileDemoDirectoryMKDIRSdemo {
public static void main(String[] args) throws IOException {
	File f=new File("Capgi/Capgi2/Capgi3/Capgi4/Capgi5/Myfile1.txt");
	f.getParentFile().mkdirs();
	f.createNewFile();
	System.out.println("Directory and file created"+f.getCanonicalPath());
	System.out.println("Directory and file deleted"+f.delete());
	
}
}
