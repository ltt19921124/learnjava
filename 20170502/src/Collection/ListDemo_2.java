package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



public class ListDemo_2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		ListIterator it =  list.listIterator();//��ȡ�б�����������
		//����ʵ���ڵ�����������ɶ�Ԫ�ص���ɾ�Ĳ飬ֻ��list���Ͼ��иù���
		while(it.hasNext()) {
			
			Object obj = it.next();
			
			if(obj.equals("abc2")) {
				it.add("abc9");
			}
			
		}
//		System.out.println("hasnext:" + it.hasNext());
//		System.out.println("hasPrevious:" + it.hasPrevious());
		
		while(it.hasPrevious()) { 
			System.out.println("previous:" + it.previous());
		}
		
		
		System.out.println(list);
		
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			
//			Object obj = it.next();//java.util.ConcurrentModificationException
//							//�ڵ����в�Ҫʹ�ü��ϲ���Ԫ�أ�������쳣
//			if(obj.equals("abc2")) {
//				list.add("abc9");
//				
//			}
//			else
//				System.out.println("next:" + obj);
//			
//		}
		
		
		System.out.println(list);
	}
	

	public static void show(List list) {
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//ͨ�õ�ȡ����ʽ
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//list���е�ȡ��Ԫ�ط�ʽ֮һ
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("get:" + list.get(i));
//		}
	
	}

}





