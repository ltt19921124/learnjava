package newFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		
		
		 //�ϰ汾��java�����ַ���
		 /*
		List<String> names = Arrays.asList("peter","anna","mike","xenia");
		
		Collections.sort(names,new Comparator<String>(){
			
			public int compare(String a,String b) {
				return b.compareTo(a);
			}
			
		});
		
		System.out.println(names);
		*/
		//1,�°汾����
//		List<String> names = Arrays.asList("peter","anna","mike","xenia");
//		Collections.sort(names, (String a, String b) -> {
//		    return b.compareTo(a);
//		});
//		
//		System.out.println(names);
		
		//2,��������ʽ
//		List<String> names = Arrays.asList("peter","anna","mike","xenia");
//		
//		Collections.sort(names, (String a, String b) -> b.compareTo(a));
//		System.out.println(names);
		
		//3,�ټ�����ʽ
//		List<String> names = Arrays.asList("peter","anna","mike","xenia");
//		
//		Collections.sort(names, (a, b) -> b.compareTo(a));
//		System.out.println(names);
		
		
		
		
	}

}








