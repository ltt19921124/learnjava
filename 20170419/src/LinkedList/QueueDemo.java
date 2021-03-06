package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		//追加元素
		queue.offer("abc1");
		queue.offer("abc2");
		queue.offer("abc3");
		queue.offer("abc4");
		System.out.println(queue);//[abc1, abc2, abc3, abc4]
		
		//从队首去除元素并删除
		String poll = queue.poll();
		System.out.println(poll);
		System.out.println(queue);
		
		//从队首去除元素但是不删除
		String peek = queue.peek();
		System.out.println(peek);
		System.out.println(queue);
		
		//遍历队列，这里注意，每次取完元素后都会删除，整个队列会变短，所以只要判断队列的大小即可
		while(queue.size() > 0) {
			System.out.println(queue.poll());
		}
		
	}	

}
