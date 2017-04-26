package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo_2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("demo.txt");
		
		//read(cgar[])读取文本文件数据
		
		char[] buf = new char[1024];
		int len = 0;
//		int num = fr.read(buf);
//		
//		System.out.println(num + ":" + new String(buf));
//		int num1 = fr.read(buf);
//		System.out.println(num1 + ":" + new String(buf));
		
		while((len=fr.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		
		
//		fr.close();
		
	}

}
