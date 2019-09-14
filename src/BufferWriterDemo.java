import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
public static void main(String[] args) throws IOException {
	FileWriter w=new FileWriter("Jam1.txt");
	BufferedWriter b=new BufferedWriter(w);
	b.write("Chandru");
	System.out.println("Done");
	
	b.close();
}
}
