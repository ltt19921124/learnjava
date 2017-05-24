package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("demo.txt",true);
		
		//数据写入到了临时存储区中
		fw.write("a" + LINE_SEPARATOR + "jdhdndc");//换行  "\r\n" windwos系统下
		//关闭流
//		fw.flush();
		
		fw.close();
//		fw.write("aa");
		
		
		
	}

}
