package Chapter6;

public class Primitive2Wrapper {

	public static void main(String[] args) {
		
		boolean b1 = true;
		Boolean blObj = new Boolean(b1);
		int it = 5;
		Integer itObj = new Integer(it);
		Float fl = new Float("4.56");
		Boolean bObj = new Boolean("false");
		//�����쳣��
//		Long lObj = new Long("ddd");//java.lang.NumberFormatException
		//ȡ��Boolean�������boolean����
		boolean bb = bObj.booleanValue();
		//ȡ��Integer�������int����
		int i = itObj.intValue();
		//ȡ��Float�������float����
		float f = fl.floatValue();
		System.out.println(bb);
		System.out.println(i);
		System.out.println(f);
		
	}

}