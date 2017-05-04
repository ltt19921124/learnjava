import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
//		method(map);
		method_1(map);
	}
	
	public static void method_1(Map<Integer,String> map) {
		
		map.put(8, "wangwu");
		map.put(2, "zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(6, "wangcai");
		
		
		
		//取出map所有元素
		//通过keyset方法获取map中所有的键所在的set集合，再通过set的迭代器获取每一个键
		//再对每一个键获取对应的值即可
		
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		
//		while(it.hasNext()) {
//			Integer key = it.next();
//			String value = map.get(key);
//			System.out.println(key + ":" + value);
//		}
		
		/*
		 * 通过Map转成set就可以迭代
		 * 找到entrySet
		 * 该方法将键和值得映射关系作为对象存储到了set集合中，而这个映射关系的类型就是Map.Entry类型(结婚证)
		 * 
		 * 
		 */
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		
//		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry<Integer, String> me = it.next();
//			Integer key = me.getKey();
//			String value = me.getValue();
//			System.out.println(key + "::" + value);
//		}
		
	}
	
	
	
	public static void method(Map<Integer,String> map) {
		
		//添加元素
		System.out.println(map.put(8,"wangcai"));//null
		System.out.println(map.put(8,"xiaoqiang"));//wangcai
		map.put(2, "zhansan");
		map.put(7, "zhaoliu");
		
		//删除
//		System.out.println("remove:" + map.remove(2));//remove:zhansan
		
		//判断
//		System.out.println("containskey:" + map.containsKey(7));//containskey:true
		
		//获取
//		System.out.println("get:" + map.get(8));//get:xiaoqiang
		
		
		System.out.println(map);
	}

}













