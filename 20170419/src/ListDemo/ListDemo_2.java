package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ListDemo_2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
//		System.out.println(list.get(2));
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			
//			Object obj = it.next();
//			if(obj.equals("abc2")) {
//				list.add("abc9");
//			} else{
//				System.out.println("next:" + obj);
//			}
//			
//			System.out.println(list);
//			
//		}		
		
	}

	private static void show(List list) {
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println("next:" + it.next());
//		}
		
		//list���е�ȡ��Ԫ�ط�ʽ
		
		for(int x = 0;x < list.size();x++){
			System.out.println("get:" + list.get(x));
		}
		
//		System.out.println("lsit:" + list.get(3));
		
	}

}


