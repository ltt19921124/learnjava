package String;

/*
 * 
 * 2,一个子串在字符串出现的次数
 * 思路：
 * 1，确定子串是否存在，用indexOf
 * 2，如果找到了，那么记录出现的位置并在剩余的字符串中继续查找该子串
 * 剩余的字符串的起始位置是出现位置+子串长度
 * 3，以此类推
 * 
 * */
public class StringTest2 {
	
	public static void main(String[] args) {
		
		String str = "nbaernbatnbaynbauinbaopnba";
		String key = "nba";
		
//		int count = getKeyStringCount_2(str,key);
//		System.out.println("couunt=" + count);
		
//		String s = "abcsdk";
//		String s1 = s.substring(2);
//		System.out.println(s1);
	}

	public static int getKeyStringCount_2(String str, String key) {
		
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(key,index)) != -1){
			
			index = index + key.length();
			count++;
			
		}
		
		return count;
	}

	public static int getKeyStringCount(String str, String key) {
		
		//计数器
		int count = 0;
		
		//定义变量
		int index = 0;
		
		while((index = str.indexOf(key)) != -1){
			
			str = str.substring(index + key.length());
			
			count++;
		}
		
		return count;
	}
}








