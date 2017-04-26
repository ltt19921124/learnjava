package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {

	public static void main(String[] args) {
		
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader("IO��2.txt");
			fw = new FileWriter("copytest_2.txt");
			
			char[] buf = new char[1024];
			//��¼��ȡ�����ַ�������ʵ��������װ���ַ�����
			
			int len = 0;
			while((len=fr.read(buf)) != -1) {
				fw.write(buf , 0 ,len);
			}
			
			
			
		}catch (Exception e) {
//			System.out.println("��дʧ��");
			throw new RuntimeException("��дʧ��");
			
		}finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}






