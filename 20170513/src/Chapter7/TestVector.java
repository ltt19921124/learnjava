package Chapter7;

import java.util.Stack;

public class TestVector {
	public static void main(String[] args) {
		
//		Integer a = 127;
//		
//		Integer b = 127;
//		Integer c = 128;
//		Integer d = 128;
//		System.out.println(a == b);//true
//		System.out.println(c == d);//flase
		
//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = new String("abc");//
//		System.out.println(s1 == s2);//true
//		System.out.println(s1 == s3);//false
//		System.out.println(s2 == s3);//false
		Stack v = new Stack();
		v.push("权威指南");
		v.push("应用实战");
		v.push("最佳实践");
		//输出元素
		System.out.println(v);
		//访问第一个元素，但不将其出栈
		System.out.println(v.peek());//最佳实践
		System.out.println(v);//[权威指南, 应用实战, 最佳实践]
		//返回栈的第一个元素，并将该元素"pop"出栈
		System.out.println(v.pop());//最佳实践
		System.out.println(v);//[权威指南, 应用实战]
		
	}

}















