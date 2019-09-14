import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
public static void main(String[] args) throws IOException {
	File f=new File("jam1.txt");
	FileReader fr=new FileReader(f);
	int i=fr.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=fr.read();
	}
	fr.close();
	
}
}
