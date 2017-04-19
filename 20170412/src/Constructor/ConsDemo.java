package Constructor;

class Person{
	private String name;
	private int age;
	//定义构造函数
	
	Person(){//空参数的构造函数
		System.out.println("person run");
	}
	Person(String name){
		this.name = name;
//		System.out.println(this.name + ":" + this.age);
	}
	//有参数的构造函数
	Person(String name,int age){
		this(name);
		this.age = age;
		System.out.println(this.name + ":" + this.age);
	}
	
	public void speak(){
		System.out.println(name + ":" + age);
	}
}

public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person("小强");//打印出 person run，调用了构造函数
//		p.speak();
		Person p1 = new Person("xiaoming",10);
		
	}

}
