package Chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {
		
//		String[] str = {"权威指南","应用实践"};

		List ls = new ArrayList();
		ls.add("权威指南");
		ls.add("应用实践");
//		for (int i = 0;i < ls.size();i++) {
//			ls.add(str[i]);
//		}
		ListIterator it = ls.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.add("----分隔符-----");
		}
		System.out.println("=====下面开始反向迭代======");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}




