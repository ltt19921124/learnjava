package Chapter5_Extends;

public class Apple extends Fruit{

	public static void main(String[] args) {
		
		//创建Apple对象
		Apple a = new Apple();
		//Apple对象本身没有weight属性
		//因为基础了Fruit类，所以可以访问父类的属性
		a.weight = 56;
		a.info();
	}

}
