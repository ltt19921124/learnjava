package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		show(list);

	}

	public static void show(List<String> list) {
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
//		System.out.println(list);
		
		//插入元素
//		list.add(1, "abc9");
		
		//删除元素
//		System.out.println("remove:" + list.remove(2));//remove:abc3
		//修改元素
//		System.out.println("set:" + list.set(1, "abv8"));//set:abc2
		
		//获取子列表
//		System.out.println("sublist:" + list.subList(1, 2));//sublist:[abc2]
		
//		System.out.println(list);//[abc1, abc2]
		//遍历法一
//		for(String str : list) {
//			System.out.println(str);
//		}
		//遍历法二
//		String[]strArray = new String[list.size()];
//		list.toArray(strArray);
//		for(int i=0;i < strArray.length;i++) {
//			System.out.println(strArray[i]);
//		}
		//遍历法三：使用迭代器遍歷
//		Iterator<String> ite = list.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		
		
		
	}

}




