package Chapter6;

public class Primitive2Wrapper {

	public static void main(String[] args) {
		
		boolean b1 = true;
		Boolean blObj = new Boolean(b1);
		int it = 5;
		Integer itObj = new Integer(it);
		Float fl = new Float("4.56");
		Boolean bObj = new Boolean("false");
		//出现异常，
//		Long lObj = new Long("ddd");//java.lang.NumberFormatException
		//取出Boolean对象里的boolean变量
		boolean bb = bObj.booleanValue();
		//取出Integer对象里的int变量
		int i = itObj.intValue();
		//取出Float对象里的float变量
		float f = fl.floatValue();
		System.out.println(bb);
		System.out.println(i);
		System.out.println(f);
		
	}

}
