package newFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		
		
		 //老版本的java排列字符串
		 /*
		List<String> names = Arrays.asList("peter","anna","mike","xenia");
		
		Collections.sort(names,new Comparator<String>(){
			
			public int compare(String a,String b) {
				return b.compareTo(a);
			}
			
		});
		
		System.out.println(names);
		*/
		//1,新版本排列
//		List<String> names = Arrays.asList("peter","anna","mike","xenia");
//		Collections.sort(names, (String a, String b) -> {
//		    return b.compareTo(a);
//		});
//		
//		System.out.println(names);
		
		//2,更简洁的形式
//		List<String> names = Arrays.asList("peter","anna","mike","xenia");
//		
//		Collections.sort(names, (String a, String b) -> b.compareTo(a));
//		System.out.println(names);
		
		//3,再简洁的形式
//		List<String> names = Arrays.asList("peter","anna","mike","xenia");
//		
//		Collections.sort(names, (a, b) -> b.compareTo(a));
//		System.out.println(names);
		
		
		
		
	}

}









