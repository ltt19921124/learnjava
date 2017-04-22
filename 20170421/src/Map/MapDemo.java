package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
//		method(map);
		
	}
	
	public static void method_2(Map<Integer,String> map) {
		map.put(8, "wangqu");
		map.put(2, "zhaoliu");
		map.put(4, "xiaoii");
		map.put(6, "liuming");
		
		//取出元素,keyset
		Set<Integer> keySet = map.keySet();
		
		
	}
	
	
	public static void method(Map<Integer,String> map) {
		//添加
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xiaoqiang"));//wangcai
		map.put(2, "zhangsan");
		map.put(7, "zhaosi");
		
		
		//删除
//		System.out.println("remove:" + map.remove(2));//remove:zhangsan
		
		//判断
//		System.out.println("containskey:" + map.containsKey(7));//containskey:true
		
		//获取
//		System.out.println("get:" + map.get(7));//get:zhaosi
//		System.out.println(map.containsValue("zhaosi"));//true
		
		System.out.println(map);
	}
}
