package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr = new FileReader("demo.txt");
		//用Reader中的read方法读取字符
		int ch = fr.read();
		
		System.out.println(ch);
		
		int ch1 = fr.read();
		System.out.println(ch1);
		int ch2 = fr.read();
		System.out.println(ch2);
		
//		int ch = 0;
//		while((ch = fr.read()) != -1) {
//			System.out.println((char)ch);
//		}
//		
		fr.close();
		
		
		
		
	}

}
