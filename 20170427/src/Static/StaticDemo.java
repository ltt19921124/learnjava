package Static;


class Fu {
	
	void method() {
		System.out.println("父类一般方法");
	}
	
	static void staticMethod() {
		System.out.println("父类静态方法");
	}
}

class Zi extends Fu {
	
	void method() {
		System.out.println("子类一般方法");
	}
	
	static void staticMethod(){
		System.out.println("子类静态方法");
	}
	
}

class StaticDemo {

	public static void main(String[] args) {
		
//		Fu fu = new Zi();
//		fu.method();
//		fu.staticMethod();
//		
//		Zi z = new Zi();
//		z.method();
//		z.staticMethod();
		
		char c = 'a';
		System.out.println((byte)c);
		
	}

}



