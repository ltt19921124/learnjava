package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> al = new ArrayList<String>();//����
		
		al.add("abc");//add�����洢����obj����
		al.add("haha");
//		al.add(4);
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			
			String str = it.next();
			System.out.println(str);
			
		}
	}

}
