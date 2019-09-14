import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("jam1.txt");
	BufferedReader fr=new BufferedReader(f);
	String i=fr.readLine();
	while(i!=null)
	{
		System.out.println(i);
		i=fr.readLine();
	}
	fr.close();
	
}
}
