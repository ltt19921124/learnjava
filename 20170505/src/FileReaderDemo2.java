import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		//1������һ����ȡ�ַ����ݵ�������
		//�ڴ�����ȡ����ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ�����ļ��Ǵ��ڵ�
		
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		while((ch=fr.read()) != -1) {
			System.out.println((char)ch);
		}
		//��Reader�е�read������ȡ�ַ�
//		int ch = fr.read();
//		System.out.println((char)ch);
//		
//		int ch1 = fr.read();
//		System.out.println(ch1);
//		
//		int ch2 = fr.read();
//		System.out.println(ch2);
		
		
		fr.close();
	}

}