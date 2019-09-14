import java.io.File;
import java.io.IOException;

public class FileDemo2 {
public static void main(String[] args) throws IOException {
	File f=new File("Abith2.txt");
	System.out.println("p1"+f.exists());
	System.out.println("p2"+f.createNewFile());
	System.out.println("p3"+f.exists());
	System.out.println("p4"+f.isFile());
	System.out.println("p5"+f.isDirectory());
	File f1=new File("Nifaz3");
	System.out.println("p6"+f1.createNewFile());
	System.out.println("p7"+f1.exists());
	System.out.println("p8"+f1.isFile());
	System.out.println("p9"+f1.isDirectory());
	System.out.println("p9"+f1.mkdir());
}
}
