package Chapter7;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List ls = new ArrayList();
		ls.add(new String("Ӧ��ʵս"));
		ls.add(new String("Ȩ��ָ��"));
		ls.add(new String("����"));
		System.out.println(ls);
		ls.add(1,new String("�������ʵ��"));
		for (int i = 0;i < ls.size();i++) {
			System.out.println(ls.get(i));
		}
		//ɾ��������Ԫ��
		ls.remove(2);
		System.out.println(ls);
		System.out.println(ls.indexOf(new String("�������ʵ��")));
		ls.set(1, new String("Ȩ��ָ��"));
		System.out.println(ls);
		System.out.println(ls.subList(1, 2));
		
	}

}