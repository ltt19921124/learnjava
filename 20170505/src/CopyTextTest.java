import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1,��Ҫ��ȡԴ
	//2,��������Դ����д�뵽Ŀ�ĵ�
	//3����Ȼ�ǲ����ı����ݣ����ַ���
public class CopyTextTest {

	public static void main(String[] args) throws IOException {
	
		//1,��ȡ���е��ı��ļ���ʹ���ַ���ȡ�����ļ�����
		FileReader fr = new FileReader("IO��_2.txt");
		//2,����һ��Ŀ�ģ����ڴ洢����������
		FileWriter fw = new FileWriter("copytext_1.txt");
		//3,pƵ���Ķ�ȡ����
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		//4,�ر�����Դ
		fw.close();
		fr.close();
	}

}
