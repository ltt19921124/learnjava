package Chapter6;

class Person1 {
	public boolean equals(Object obj) {
		//�����жϣ���Person�������κζ������
		return true;
	}
}

class Dog {
	
}

public class OverrideEqualsError {

	public static void main(String[] args) {
		
		Person1 p = new Person1();
		System.out.println("Person�����Ƿ�equals Dog����?" + p.equals(new Dog()));
		System.out.println("Person�����Ƿ�equals String����?" + p.equals(new String("hello")));
		
	}

}