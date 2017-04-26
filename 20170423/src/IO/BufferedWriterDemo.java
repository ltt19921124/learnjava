package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//Ϊ�����Ч�ʣ�ʹ�����ַ����Ļ�����
		//������һ���ַ�д�����Ļ�����󣬲���ָ��Ҫ���ͻ���������������
		BufferedWriter bufw = new BufferedWriter(fw);
		//ʹ�û�������д�뷽����������д�뵽��������
		bufw.write("abcdee" + LINE_SEPARATOR + "hahaha");
		//ʹ�û�������ˢ�·���������ˢ�µ�Ŀ�ĵ���
		bufw.flush();
		
		//�رջ���������ʵ�رյ��Ǳ����ɵ�������
		bufw.close();
		
//		fw.write("hehe");
		
//		fw.close();
		int a = 1;
		int b = 1;
//		System.out.println(a == b);//true
		
//		String s = "abc";
//		String s1 = new String("abc");
//		System.out.println(s == s1);//false
//		
//		System.out.println(s.equals(s1));//false
		int[] arr = {1,2,3};
		System.out.println(arr[4]);
		
//		int i = 1/0;
//		System.out.println(i);
		
//		Object obj = null;
//		obj.toString();
		int[] arr2 = new int[3];
		arr2[1] = 0;
	}

}