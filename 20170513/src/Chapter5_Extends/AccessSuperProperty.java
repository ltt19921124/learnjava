package Chapter5_Extends;

class BaseClass {
	
	public int a = 5;

}

class SubClass extends BaseClass {
	
	public int a = 7;
	public void accessOwner() {
		System.out.println(a);
	}
	public void accessBase() {
		
		//通过super来访问方法调用者对象对应的父类对象
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		
		SubClass sc = new SubClass();
		sc.accessOwner();
		sc.accessBase();
		
	}
}
