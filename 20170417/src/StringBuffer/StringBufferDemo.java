package StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		/*
		 * StringBuffer:就是字符串缓冲区
		 * 
		 * 特点：1，长度是可变
		 * 	   2，可以存储不同类型数据
		 * 	   3，最终要转成字符串进行使用
		 * 	   4,可以对字符串进行修改
		 * 
		 * 
		 * */
		bufferMethodDemmo_2();
		
	}

	private static void bufferMethodDemmo_2() {
		
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.delete(0, sb.length());//清空缓冲区
//		sb.replace(1, 2, "nba");//anbace
		
//		sb.setCharAt(2, 'q');//abqe
		
//		sb.setLength(5);//设置长度
//		System.out.println(sb);
//		System.out.println("sb:" + sb);
//		System.out.println("len:" + sb.length());
		System.out.println(sb.reverse());//ecba
		
		
	}

	public static void bufferMethodDemmo_1() {
		StringBuffer sb = new StringBuffer("abce");
		
		sb.insert(2, "qq");
		System.out.println(sb);//abqqce
		
	}

	public static void bufferMethodDemmo() {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(false).append("haha");
		sb.insert(1,"h");
		System.out.println(sb);
//		System.out.println(sb);//4falsehaha
		

//		sb.append(true);
//		System.out.println(sb);//4true
		
//		StringBuffer s1 = sb.append("4");
		
//		System.out.println(sb);
//		System.out.println(s1);
//		System.out.println(sb == s1);//true，返回的还是原来那个容器，所以指向同一个实例
		
	}

}










