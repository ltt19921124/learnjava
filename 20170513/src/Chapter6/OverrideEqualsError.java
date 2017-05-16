package Chapter6;

class Person1 {
	public boolean equals(Object obj) {
		//不加判断，即Person对象与任何对象都相等
		return true;
	}
}

class Dog {
	
}

public class OverrideEqualsError {

	public static void main(String[] args) {
		
		Person1 p = new Person1();
		System.out.println("Person对象是否equals Dog对象?" + p.equals(new Dog()));
		System.out.println("Person对象是否equals String对象?" + p.equals(new String("hello")));
		
	}

}
