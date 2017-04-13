
/*
 * 对象的多态性：
 * 
 *猫  x = new 猫();
 *动物  x = new 猫();
 * 
 * 父类或者接口的引用指向子类对象
 * 一个对象，两种形态
 * 
 * */


package DuoTai;


class DuoTaiDemo {
	public static void main(String[] args){
//		Cat c = new Cat();
//		c.eat();
//		Cat c1 = new Cat();
//		Dog d = new Dog();
//		method(d);
//		method(d);
		
//		Cat c = new Cat();
		Animal a = new Cat();//自动类型提升，限制对特有功能的访问
		a.eat();
		//向下转型，就可以继续使用子类的特有功能
		
		Cat c = (Cat)a;//向下转型，强制转换
		c.catchMouse();
		c.eat();
		//对于转型，自始自终都是子类对象在做这类型的转换
		
//		Animal a1 = new Dog();
//		Cat c1 = (Cat)a1;//类型转换异常
		
	}
	
	public static void method(Cat c){
		c.eat();
	}
	
	public static void method(Dog d){
		d.eat();
	}
	public static void method(Animal a){
		a.eat();
	}
}











