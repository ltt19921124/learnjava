package String;


/*
 * 获取两个字符串的最大相同子串：
 *  看短的那个字符串是否在长的里面，若存在
 *  
 * 
 * 
 * */


public class StringTest_3 {
	
	public static void main(String[] args) {
		
		String s1 = "qwerabcdtyuio";
		String s2 = "xcerghn";
		
		String s = getMaxSubString(s1,s2);
		System.out.println("s=" + s);
	}

	private static String getMaxSubString(String s1, String s2) {
		
		String max = null,min = null;
		
		max = (s1.length() >　說)
		
		
		for (int i = 0; i < s2.length(); i++) {
			for(int a = 0,b = s2.length() - i;b != s2.length() + 1;a++,b++) {
				String sub = s2.substring(a, b);
//				System.out.println(sub);
				if (s1.contains(sub))
					return sub;
			}
		}
		
		return null;
		
	}
	
}






