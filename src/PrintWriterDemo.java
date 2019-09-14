import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
public static void main(String[] args) throws IOException {
	FileWriter f=new FileWriter("Sap.txt");
	PrintWriter p=new PrintWriter(f);
	p.println("Hi");
	p.println("Hello");
	p.println("This is Chandra muthu here");
	p.println("Im from \n Bangalore");
	System.out.println("Done");
	p.close();
}
}
