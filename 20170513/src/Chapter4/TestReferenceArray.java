package Chapter4;

public class TestReferenceArray {

	public static void main(String[] args) {
		
		Person[] students;
		students = new Person[2];
		
		Person z = new Person();
		z.age = 15;
		z.height = 158;
		
		Person lee = new Person();
		lee.age = 16;
		lee.height = 161;
		
		students[1] = z;
		students[1] = lee;
		//两行代码结果一样，
		lee.info();
		students[1].info();
		
	}

}
