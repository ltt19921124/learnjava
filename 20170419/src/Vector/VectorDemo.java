package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		//有elements的方法都是vector的特有方法
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println("nextelement:" + en.nextElement());
		}
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
