package Chapter7;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set books = new HashSet();
		books.add("Ȩ��ָ��");
		boolean result = books.add("Ȩ��ָ��");
		System.out.println(books);
		System.out.println(result);//false
		
		
	}

}