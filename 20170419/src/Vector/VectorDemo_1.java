package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo_1 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("abc1");
		v.add("abc2");
		v.add("abc3");
		v.add("abc4");
		
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println("nextelement:" + en.nextElement());
		}
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println("next:" + it.next());
		}
		
		
	}

}










