package Static;


class Fu {
	
	void method() {
		System.out.println("����һ�㷽��");
	}
	
	static void staticMethod() {
		System.out.println("���ྲ̬����");
	}
}

class Zi extends Fu {
	
	void method() {
		System.out.println("����һ�㷽��");
	}
	
	static void staticMethod(){
		System.out.println("���ྲ̬����");
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


