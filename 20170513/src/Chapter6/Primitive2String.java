package Chapter6;

public class Primitive2String {

	public static void main(String[] args) {
		
		String intStr = "123";
		//��һ���ض����ַ���ת����int����
		int it = Integer.parseInt(intStr);
		System.out.println(it);//123
		String floatStr = "4.56";
		float ft = Float.parseFloat(floatStr);
		System.out.println(ft);//4.56
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		String dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
		
		
	}

}
