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
		v.push("Ȩ��ָ��");
		v.push("Ӧ��ʵս");
		v.push("���ʵ��");
		//���Ԫ��
		System.out.println(v);
		//���ʵ�һ��Ԫ�أ����������ջ
		System.out.println(v.peek());//���ʵ��
		System.out.println(v);//[Ȩ��ָ��, Ӧ��ʵս, ���ʵ��]
		//����ջ�ĵ�һ��Ԫ�أ�������Ԫ��"pop"��ջ
		System.out.println(v.pop());//���ʵ��
		System.out.println(v);//[Ȩ��ָ��, Ӧ��ʵս]
		
	}

}














