package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("demo.txt",true);
		
		//����д�뵽����ʱ�洢����
		fw.write("a" + LINE_SEPARATOR + "jdhdndc");//����  "\r\n" windwosϵͳ��
		//�ر���
//		fw.flush();
		
		fw.close();
//		fw.write("aa");
		
		
		
	}

}