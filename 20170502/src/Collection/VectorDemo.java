package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements()) {
			System.out.println("nextelement:" + en.nextElement());
		}
		
		
	}

}
