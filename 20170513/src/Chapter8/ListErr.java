package Chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListErr {

	public static void main(String[] args) {
		//����ʱ��������Ϳ��ܵ��µ����⡣
		List strList = new ArrayList();
		strList.add("Ȩ��ָ��");
		strList.add("����");
		strList.add("Ӧ��ʵ��");
		//"��С��"��һ��Integer����Ž�ȥ��
		strList.add(5);//1
		for (int i = 0;i < strList.size();i++) {
			//List��ŵĶ�object�������Ա���ǿ��ת��
			// �������ᵼ������ת���쳣java.lang.ClassCastException
			String str = (String) strList.get(i);//2
		}

	}

}