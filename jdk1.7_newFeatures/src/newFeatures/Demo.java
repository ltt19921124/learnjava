package newFeatures;

public class Demo {

	public static void main(String[] args) {
		
		
		Demo a = new Demo();
		Demo b = a;
		System.out.println(a.equals(b));
		int[] arr = new int[3];
//		System.out.println(arr);
		
		String str = "abcd";
		String str2 = "abcd";
		String str3 = str;
		System.out.println(str.equals(str3));
		
//		System.out.println(str);
//		System.out.println(str.hashCode());
		
	}

}