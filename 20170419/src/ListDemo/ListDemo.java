package ListDemo;

import java.util.ArrayList;
import java.util.List;

public final class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);

	}

	public static void show(List list) {
		//����Ԫ��
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//����Ԫ��
//		list.add(1, "abc9");
		
		//ɾ��Ԫ��
//		System.out.println("remove:" + list.remove(2));//remove:abc3
		//�޸�Ԫ��
//		System.out.println("set:" + list.set(1, "abv8"));//set:abc2
		
		//��ȡ���б�
		System.out.println("sublist:" + list.subList(1, 2));//sublist:[abc2]
		
		System.out.println(list);//[abc1, abc2]
		
	}

}



