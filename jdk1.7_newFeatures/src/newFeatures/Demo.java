package newFeatures;

import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class Demo {

	public static void main(String[] args) {
		
		
//		Demo a = new Demo();
//		Demo b = a;
//		System.out.println(a.equals(b));
//		int[] arr = new int[3];
//		System.out.println(arr);
//		
//		String str = "abcd";
//		String str2 = "abcd";
//		String str3 = str;
//		System.out.println(str.equals(str3));
//		
//		System.out.println(str);
//		System.out.println(str.hashCode());
	
		/**
		 * jdk 1.7新特性
		 * 1，二进制字面量
		 * 
		 * 2，数字字面量可以出现下划线
		 * 		int a = 10_1000_000;
		 * 		byte b = 0b0100_1000;
		 * 
		 * 
		 * 3，String语句可以用字符串了
		 * 		switch(str){
		 * 			
		 * 
		 * 		}
		 * 4，泛型实例的创建可以通过类型推断来简化
		 * 		
		 * 
		 * 
		 * 7，Catch多个Exceptionrethrow exception改进了类型检测
		 * 
		 */
		byte b = 0b00101;
		System.out.println(b);
		
		short s = (short)0b0100;
		System.out.println(s);
		
		int i = (int)0b0100;
		System.out.println(i);
		
		long l = 0b0100L;
		System.out.println(l);
		
		/**
		 * 2,数字字面量可以出现下划线
		 *
		 */
		int a = 10_0000_0000;
		long b1 =  0xff_ff;
		byte b2 = 0b0001_1000;
		System.out.println(b2);
		
		
		
		
	}

}
















