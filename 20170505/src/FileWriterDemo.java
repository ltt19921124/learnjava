import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		//����һ���������ļ� ��д���ַ����ݵ��ַ����������
		/*
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ�(���ڴ洢���ݵ�Ŀ�ĵ�)
		 * 
		 */
		
		FileWriter fw = new FileWriter("demo.txt",true);
		
		//����writer�����writer(string)������д������
		//��ʵ���ݾ�д�뵽����ʱ�洢������
		//���캯���м���true�����Զ��ļ�������д
		
		fw.write("abcde" + LINE_SEPARATOR + "nhaha");
//		fw.write("xixi");

		//ˢ�¡�������ֱ��д�뵽Ŀ�ĵ���
//		fw.flush();
		
		fw.close();
		
//		fw.write("cc");//java.io.IOException
		
		
	}

}











