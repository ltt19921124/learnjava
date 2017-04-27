package LinkedList;

import java.util.LinkedList;




public class LinklistTest {

	public static void main(String[] args) {
		/*
		 * 用linkedlist来模拟一个堆栈或者队列数据结构
		 * 
		 * 堆栈：栈：先进后出
		 * 
		 * 队列：先进先出
		 * 
		 * 描述这样一个容器，给使用者提供一个容器对象完成这两种结构中
		 * 的一种
		 * 
		 * 
		 * */
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull()) {
			System.out.println(dl.myGet());
		}
		
	}

}



