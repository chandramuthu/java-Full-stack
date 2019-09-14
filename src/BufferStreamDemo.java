import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamDemo {
public static void main(String[] args) throws IOException {
	String filepath="jam1.txt";
	FileOutputStream fos=new FileOutputStream(filepath);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	String s="oracle.com";
	byte[] b=s.getBytes();
	bos.write(b);
	bos.flush();
	FileInputStream fis=new FileInputStream(filepath);
	BufferedInputStream bis=new BufferedInputStream(fis);
	int i;
	while((i=bis.read())!=-1)
{
	System.out.println((char)i);
}
	bis.close();
	bos.close();
}
}
