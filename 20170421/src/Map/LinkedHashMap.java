package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(7, "zhaosi");
		hm.put(3, "liliu");
		hm.put(1, "kk");
		hm.put(7, "zhouliu");
		
		Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer, String> me = it.next();
			
			Integer key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key + ":" + value);
		}
	}

}
