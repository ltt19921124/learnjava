package Chapter7;

import java.util.HashMap;

public class NullHashMap {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		//将两个key为null的键值对放入HashMap中
		hm.put(null, null);
		hm.put(null, null);//无法将键值对放入，因为已经有一个key为null
		//将一个value的键值对放入HashMap中
		hm.put("a", null);
		System.out.println(hm);

	}

}
