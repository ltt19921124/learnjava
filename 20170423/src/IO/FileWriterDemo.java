package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		//����
		
		FileWriter fw = new FileWriter("demo.txt");
		fw.write("abcde" + LINE_SEPARATOR +"hahaha");
//		fw.flush();
		
		fw.close();
		
		
		
	}

}
