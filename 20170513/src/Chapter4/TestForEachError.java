package Chapter4;

public class TestForEachError {

	public static void main(String[] args) {
		
		String[] books = {"轻量级J2EE企业应用实战","权威指南","宝典"};
		
		for (String book : books) {
			//通常不需要对循环变量进行赋值了
			
			book = "最佳实践";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}

}
