package LinkedList;

import java.util.LinkedList;




public class LinklistTest {

	public static void main(String[] args) {
		/*
		 * ��linkedlist��ģ��һ����ջ���߶������ݽṹ
		 * 
		 * ��ջ��ջ���Ƚ����
		 * 
		 * ���У��Ƚ��ȳ�
		 * 
		 * ��������һ����������ʹ�����ṩһ������������������ֽṹ��
		 * ��һ��
		 * 
		 * 
		 * */
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()) {
			System.out.println(dl.myGet());
		}
		
	}

}



