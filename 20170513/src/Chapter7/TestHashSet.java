package Chapter7;

import java.util.HashSet;

class A {
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	public int hashCode() {
		return 1;
	}
}

class C {
	public int hashCode() {
		return 2;
	}
	public boolean equals(Object obj) {
		return true;
	}
}

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet books = new HashSet();
		//分别向books集合添加两个A元素，B元素，C元素
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);//[Chapter7.B@1, Chapter7.B@1, Chapter7.C@2, Chapter7.A@15db9742, Chapter7.A@6d06d69c]

		
		
	}

}











