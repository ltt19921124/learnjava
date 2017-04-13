package aa;


class Car{
	int num = 4;
	String color;
	
	void run(){
//		int num = 10;
		System.out.println(num + "..." + color);
	}
}


class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c = new Car();//c是一个类类型的引用变量
//		c.num = 4;
//		c.color = "red";
//		c.run();
		Car c1 = new Car();
		Car c2 = new Car();
//		show(c2);
		/*
		 *匿名对象 
		 */
//		new Car();//匿名对象，就是定义对象的简写格式
//		new Car().run();//匿名对象的使用方式之一，当对象对于方法仅仅进行一次调用的时候，
		//就可以简化成匿名对象
		new Car().num = 5;
		new Car().color = "green";
		//匿名对象可以作为实际参数进行传递
		show(new Car());//作为实际参数进行传递，匿名对象不会变成垃圾
	
	}
	//汽车改装厂
	public static void show(Car c){
		c.num = 3;
		c.color = "black";
		System.out.println(c.num + "..." + c.color);
	}

}
