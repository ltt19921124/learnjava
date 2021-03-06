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
		
		ListIterator it =  list.listIterator();//获取列表迭代器对象
		//可以实现在迭代过程中完成对元素的增删改查，只有list集合具有该功能
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
//							//在迭代中不要使用集合操作元素，会出现异常
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
		
		//通用的取出方式
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//list特有的取出元素方式之一
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println("get:" + list.get(i));
//		}
	
	}

}






