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
		
		
		
		//ȡ��map����Ԫ��
		//ͨ��keyset������ȡmap�����еļ����ڵ�set���ϣ���ͨ��set�ĵ�������ȡÿһ����
		//�ٶ�ÿһ������ȡ��Ӧ��ֵ����
		
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> it = keySet.iterator();
//		
//		while(it.hasNext()) {
//			Integer key = it.next();
//			String value = map.get(key);
//			System.out.println(key + ":" + value);
//		}
		
		/*
		 * ͨ��Mapת��set�Ϳ��Ե���
		 * �ҵ�entrySet
		 * �÷���������ֵ��ӳ���ϵ��Ϊ����洢����set�����У������ӳ���ϵ�����;���Map.Entry����(���֤)
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
		
		//����Ԫ��
		System.out.println(map.put(8,"wangcai"));//null
		System.out.println(map.put(8,"xiaoqiang"));//wangcai
		map.put(2, "zhansan");
		map.put(7, "zhaoliu");
		
		//ɾ��
//		System.out.println("remove:" + map.remove(2));//remove:zhansan
		
		//�ж�
//		System.out.println("containskey:" + map.containsKey(7));//containskey:true
		
		//��ȡ
//		System.out.println("get:" + map.get(8));//get:xiaoqiang
		
		
		System.out.println(map);
	}

}












