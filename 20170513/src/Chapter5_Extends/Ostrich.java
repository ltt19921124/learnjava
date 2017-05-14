package Chapter5_Extends;

	/*
	 * super和this都不能出现在static修饰的方法中
	 * static修饰的方法时属于类的
	 * 
	 */
public class Ostrich extends Bird{
	int a = 5;
	
	//重写了父类的fly方法
	public void fly() {
		System.out.println("我只能在地上跑...");
	}

	public static void main(String[] args) {
		
		//创建对象
		Ostrich os = new Ostrich();
		//执行fly方法，
//		os.fly();//我只能在地上跑...
		
		os.callOverrideMethod();//我在天空自由的飞翔...
		
	}
	public void callOverrideMethod() {
		//在子类方法中通过super显式调用父类被覆盖的方法
		super.fly();//
	}

}
