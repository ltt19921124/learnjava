package ListDemo;

import java.util.ArrayList;
import java.util.List;

public final class ListDemo_2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		show(list);
		
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
		
//		for(String str : list){
//			System.out.println(str);
//		}
//		int[] arr = new int[3];
//		int b = arr.length;
//		String[] strArray = new String[list.size()];
//		list.toArray(strArray);
//		for(int i = 0;i < strArray.length;i++){
//			System.out.println(strArray[i]);
//		
//		}
//		for(String str:list){
//			System.out.println(str);
//		}
		
		
	}

	private static void show(List<String> list) {
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println("next:" + it.next());
//		}
		
		//list特有的取出元素方式
		for(int x = 0;x < list.size();x++){
			System.out.println("get:" + list.get(x));
		}
		
		
//		System.out.println("lsit:" + list.get(3));
		
	}

}



