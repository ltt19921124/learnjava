package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		
//		String[] str = {"Ȩ��ָ��","Ӧ��ʵ��"};

		List ls = new ArrayList();
		ls.add("Ȩ��ָ��");
		ls.add("Ӧ��ʵ��");
//		for (int i = 0;i < ls.size();i++) {
//			ls.add(str[i]);
//		}
		ListIterator it = ls.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.add("----�ָ���-----");
		}
		System.out.println("=====���濪ʼ�������======");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}



