import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import sun.security.util.Length;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		
		FileReader fr = new FileReader("demo.txt");
		
		/*
		 * 使用read(char[])读取文本文件数据。
		 * 先创建字符数组，
		 * 
		 */
		char[] buf = new char[3];
		
		int len = 0;
//		len = fr.read(buf);
//		System.out.println(len);
		while((len = fr.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		
//		
//		int num = fr.read(buf);//将读到的字符存储到数组中
//		System.out.println(num + ":" + new String(buf));
//		int num1 = fr.read(buf);//将读到的字符存储到数组中
//		System.out.println(num1 + ":" + new String(buf));
//		int num2 = fr.read(buf);//将读到的字符存储到数组中
//		System.out.println(num2 + ":" + new String(buf));
		fr.close();
		
		
	}

}
