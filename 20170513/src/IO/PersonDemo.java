package IO;

/*
 * 装饰着模式：对一组对象的功能进行增强时，就可以使用该模式进行问题的解决
 * 
 * 装饰和继承都有一样的特点：都可以对功能进行扩展
 * 
 * 它们有什么区别呢？
 * 
 * 
 * 	TextWriter:用于操作文本
 *   
 * 	MediaWriter：用于操作媒体资源
 *  
 * 想要对操作的动作 进行下效率的提高，按照面向对象的，可以通过继承对具体的功能进行扩展
 * 效率提高需要加入缓冲技术
 * 
 * writer
 * 		|----TextWriter:
 * 			|----BufferedWriter:加入了缓冲技术的操作文本的对象
 * 
 * 		|----MediaWriter:用于操作媒体
 * 			|----BufferedMediaWriter:加入了
 * 
 * 继承体系会越来越臃肿，
 * 
 * 
 */

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p = new Person();
//		p.chifan();
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
	}

}

class Person {
	
	void chifan() {
		System.out.println("吃饭");
	}
}

//增强person而出现的

class NewPerson {
	private Person p;
	
	NewPerson(Person p) {
		this.p = p;
	}
	
	public void chifan() {
		
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
		
	}
	
}










