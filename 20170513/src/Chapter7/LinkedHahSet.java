package Chapter7;

import java.util.LinkedHashSet;

public class LinkedHahSet {

	public static void main(String[] args) {
		
		LinkedHashSet books = new LinkedHashSet();
		books.add("ָ��");
		books.add("aa");
		books.add("bb");
		books.remove("ָ��");
		books.add("ָ��");
		books.add("cc");
		System.out.println(books);//[aa, bb, ָ��, cc],linkedHashset��Ҫά��Ԫ�صĲ���˳��
		
	}

}