package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//���󣬶�ȡһ���ı��ļ������������ַ���ӡ������̨


public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//1,������ȡ�ַ����ݵ�������
		/*
		 * 
		 * �ڴ�����ȡ������ʱ������Ҫ��ȷ����ȡ���ļ�(������ô���أ�)��һ��Ҫȷ���ļ��Ǵ��ڵ�
		 * ��һ����ȡ�������ļ�
		 * 
		 */
		FileReader fr = new FileReader("demo.txt");
		
		//��reader�е�reader������ȡ�ַ�
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
//		int ch = fr.read();
//		System.out.println((char)ch);//a
//		
//		int ch2 = fr.read();
//		System.out.println(ch2);//98
//		
//		int ch3 = fr.read();
//		System.out.println(ch3);//-1
		
		
		fr.close();
		
		
	}

}