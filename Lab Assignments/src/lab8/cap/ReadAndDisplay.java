package lab8.cap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplay {
	public static void main(String[] args) throws IOException {
		int line=0;
		FileReader fr1=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr1);
		String result=br.readLine();
		while (result!=null) {
			System.out.println((++line)+" "+result);
			result=br.readLine();
		}
	}
}
