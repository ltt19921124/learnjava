package Chapter7;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List ls = new ArrayList();
		ls.add(new String("应用实战"));
		ls.add(new String("权威指南"));
		ls.add(new String("宝典"));
		System.out.println(ls);
		ls.add(1,new String("开发最佳实践"));
		for (int i = 0;i < ls.size();i++) {
			System.out.println(ls.get(i));
		}
		//删除第三个元素
		ls.remove(2);
		System.out.println(ls);
		System.out.println(ls.indexOf(new String("开发最佳实践")));
		ls.set(1, new String("权威指南"));
		System.out.println(ls);
		System.out.println(ls.subList(1, 2));
		
	}

}
