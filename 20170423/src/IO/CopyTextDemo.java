package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextDemo {

	public static void main(String[] args) throws IOException {
		
		
		/**
		 *
		 *��ȡ����
		 *�ַ���
		 *
		 */
		
		//1,��ȡһ�����е��ı��ļ���ʹ���ַ�����ȡ��
		FileReader fr = new FileReader("IO��2.txt");
		//2,����һ��Ŀ�ģ����ڴ洢����������
		FileWriter fw = new FileWriter("copytext.txt");
		//3,Ƶ���Ķ�ȡ����
		int ch = 0;
		
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		
		
		//4,�ر�����Դ
		fw.close();
		fr.close();
		
	}

}





