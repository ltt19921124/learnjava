package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("demo.txt");
		
		
		/*
		 * ʹ��raed(char[])��ȡ�ı��ļ�����
		 * �ȴ����ַ�����
		 *  
		 */
		char[] buf = new char[1024];
		
		int len = 0;
		
		while ((len=fr.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		
//		int num = fr.read(buf);//���������ַ��洢��������
//		System.out.println(num + ":" + new String(buf));
//		
//		int num1 = fr.read(buf);//���������ַ��洢��������
//		System.out.println(num1 + ":" + new String(buf));
//		
//		int num2 = fr.read(buf);//���������ַ��洢��������
//		System.out.println(num2 + ":" + new String(buf));
		
		
		
		
		
		fr.close();
		
		
	}

}





