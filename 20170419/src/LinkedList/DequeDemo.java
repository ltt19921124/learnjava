package LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		
		
		Deque<String> deque = new LinkedList<String>();
		
		deque.push("a");
		deque.push("b");
		deque.push("c");
		System.out.println(deque);
		
		//��ȡջ��Ԫ�غ�Ԫ�ز����ջ
		String str = deque.peek();
		System.out.println(str);
		System.out.println(deque);
		while(deque.size() > 0) {
			//��ȡջ��Ԫ�غ�Ԫ�ؽ����ջ
			System.out.println(deque.pop());
		}
		System.out.println(deque);
	}

}