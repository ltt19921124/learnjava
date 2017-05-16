package Chapter6;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println("此人名为:" + name);
	}
}

public class PrintObject {
	
	public static void main(String[] args) {
		
		//创建一个Person对象，将之赋给p变量
		Person p = new Person("孙悟空");
		//两行代码输出的内容一致，
		System.out.println(p);//Chapter6.Person@15db9742
		System.out.println(p.toString());//Chapter6.Person@15db9742

		
	}

}
