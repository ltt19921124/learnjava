package Chapter5;

public class TestPerson1 {

	public static void main(String[] args) {
		
		
		System.out.println("person1类的eyeNum类属性值:" + Person1.eyeNum);//person1类的eyeNum类属性值:0
		//
		System.out.println(Person1.address);//null
		
		Person1 p = new Person1();
		System.out.println("p变量的name属性值是:" + p.name + "p对象的eyeNum属性值是:" + p.eyeNum);//null...0
		p.name = "孙悟空";
		p.eyeNum = 2;
		System.out.println("p变量的name属性值是:" + p.name + "p对象的eyeNum属性值是:" + p.eyeNum);
		System.out.println("Person1的eyrNum类属性值:" + Person1.eyeNum);//2
		
		Person1 p2 = new Person1();
		System.out.println("p2对象的eyeNum类属性:" + p2.eyeNum);//2
		
		/*
		 * 从以上可以看出，
		 * 		1,成员变量无须显式初始化，
		 * 		2,类变量作用域比实例属性大，类属性随类的存在而存在，
		 * 
		 * 
		 */
		
	}
	

}
