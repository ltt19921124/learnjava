package Chapter7;

import java.util.LinkedHashSet;

public class LinkedHahSet {

	public static void main(String[] args) {
		
		LinkedHashSet books = new LinkedHashSet();
		books.add("指南");
		books.add("aa");
		books.add("bb");
		books.remove("指南");
		books.add("指南");
		books.add("cc");
		System.out.println(books);//[aa, bb, 指南, cc],linkedHashset需要维护元素的插入顺序
		
	}

}
