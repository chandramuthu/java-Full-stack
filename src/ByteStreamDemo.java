import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
public static void main(String[] args) throws IOException {
	String filepath="jam1.txt";
	FileOutputStream outputStream=new FileOutputStream(filepath);
	for(int i=0;i<10;i++)
	{
		outputStream.write(i);
	}
	FileInputStream inputStream=new FileInputStream(filepath);
	int i;
	while((i=inputStream.read()) !=-1)
	{
		System.out.println("i:"+i);
		
	}
}
}
