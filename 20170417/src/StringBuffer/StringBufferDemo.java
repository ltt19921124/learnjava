package StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		/*
		 * StringBuffer:就是字符串缓冲区
		 * 
		 * 特点：1，长度是可变
		 * 	   2，可以存储不同类型数据
		 * 	   3，
		 * 
		 * 
		 * 
		 * */
		bufferMethodDemmo();
		
	}

	public static void bufferMethodDemmo() {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		sb.append(4);
		sb.append(true);
		System.out.println(sb);//4true
		
//		StringBuffer s1 = sb.append("4");
		
//		System.out.println(sb);
//		System.out.println(s1);
//		System.out.println(sb == s1);//true，返回的还是原来那个容器，所以指向同一个实例
		
	}

}










