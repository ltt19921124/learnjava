package Chapter4;

public class TestForEachError {

	public static void main(String[] args) {
		
		String[] books = {"������J2EE��ҵӦ��ʵս","Ȩ��ָ��","����"};
		
		for (String book : books) {
			//ͨ������Ҫ��ѭ���������и�ֵ��
			
			book = "���ʵ��";
			System.out.println(book);
		}
		System.out.println(books[0]);
	}

}