package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		//׷��Ԫ��
		queue.offer("abc1");
		queue.offer("abc2");
		queue.offer("abc3");
		queue.offer("abc4");
		System.out.println(queue);//[abc1, abc2, abc3, abc4]
		
		//�Ӷ���ȥ��Ԫ�ز�ɾ��
		String poll = queue.poll();
		System.out.println(poll);
		System.out.println(queue);
		
		//�Ӷ���ȥ��Ԫ�ص��ǲ�ɾ��
		String peek = queue.peek();
		System.out.println(peek);
		System.out.println(queue);
		
		//�������У�����ע�⣬ÿ��ȡ��Ԫ�غ󶼻�ɾ�����������л��̣�����ֻҪ�ж϶��еĴ�С����
		while(queue.size() > 0) {
			System.out.println(queue.poll());
		}
		
	}	

}