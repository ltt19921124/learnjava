package Wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		/*
		 * 基本数据类型包装类
		 * 
		 * 讲基本数据类型包装成类
		 * 
		 * 基本数据-->字符串
		 * 		1，基本数据  + ""
		 * 		2,用String类中的静态方法valueOf()
		 * 
		 * 字符串-->基本类型
		 * 	  	
		 * 	character没有parse方法
		 * 
		 * 
		 * */
		int num = 9;
//		Integer i = num;
//		System.out.println(Integer.MAX_VALUE);//2147483647
//		System.out.println(Integer.MIN_VALUE);//-2147483648
		
//		System.out.println(Integer.toBinaryString(-6));
		Integer i = new Integer(5);
		int x = Integer.parseInt("1290");
//		System.out.println(x);
		System.out.println(Integer.parseInt("123") + 1);//124
		
//		if(Boolean.parseBoolean("true")){
//			
//		}
//		Integer a = 4;
//		a = a + 6;
//		System.out.println(a);
		
	}

}




