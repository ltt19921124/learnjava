package Chapter5_Extends;



class BaseClass {
	
	public int book = 6;
	public void base() {
		System.out.println("父类的普通方法");
	}
	
	public void test() {
		System.out.println("父类被覆盖的方法");
	}
}

class SubClass extends BaseClass{
	
	public String book = "轻量级应用实战";
	public void test() {
		System.out.println("子类覆盖父类的方法");
	}
	
	public void sub() {
		System.out.println("子类的普通方法");
	}

	public static void main(String[] args) {
		
		BaseClass bc = new BaseClass();
//		System.out.println(bc.book);
		
//		bc.base();
//		bc.test();
		
		SubClass sc = new SubClass();
//		System.out.println(sc.book);
//		sc.base();
//		sc.test();
		
		BaseClass ploymorphsimBc = new SubClass();
//		System.out.println(ploymorphsimBc.book);//6
		
		ploymorphsimBc.base();
		ploymorphsimBc.test();
//		ploymorphsimBc.sub();
		
	}

}




