import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	FileWriter f=new FileWriter("hello.txt");
	char c1[]={'a','b','c','d'};
	
	f.write(c1);
	f.write("chandru");
	f.write("\n");
	f.write("Hi");
	f.write("\n");
	f.write("Venny");
	f.write("Hello");
	System.out.println("Executed");
	f.close();
	
}
}
