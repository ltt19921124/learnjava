package Chapter7;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList books = new LinkedList();
		books.offer("ָ��");
		books.push("Ӧ��ʵս");
		books.offerFirst("����ʵ��");
		for (int i = 0;i < books.size();i++) {
			System.out.println(books.get(i));
		}
		//���ʣ�����ɾ�����еĵ�һ��Ԫ��
		System.out.println(books.peekFirst());
		//���ʣ�����ɾ�����е����һ��Ԫ��
		System.out.println(books.peekLast());
		//���ó�ջ�ķ�ʽ����һ��Ԫ��pop������
		System.out.println(books.pop());
		//���еĵ�һ��Ԫ�ؽ���ɾ��
		System.out.println(books);
		

	}

}