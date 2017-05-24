package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	private static final String LINE_SEPARETOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�������
		//������һ���ַ�д�����Ļ��������󣬲���ָ��Ҫ������������������
		
		BufferedWriter bufw = new BufferedWriter(fw);
		
		
		//ʹ�û�������д�뷽����������д�뵽��������
//		bufw.write("abcdeq" +LINE_SEPARETOR + "uhbkkgt");
//		bufw.write("xixixi");
//		bufw.newLine();//ֻ��BufferedWriter���������
//		bufw.write("hehe");
		//ʹ�û�������ˢ�·���������ˢ��Ŀ�ĵ���
		for (int x = 1;x < 5;x++) {
			bufw.write("abced" + x);
			bufw.newLine();
			bufw.flush();
			
		}
		
//		bufw.flush();
		
		//�رջ���������ʵ�رյľ��Ǳ������������
		bufw.close();
		
//		fw.write("kk");
//		fw.close();
		
	}

}
