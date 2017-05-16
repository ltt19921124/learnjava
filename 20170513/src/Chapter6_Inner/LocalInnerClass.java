package Chapter6_Inner;

public class LocalInnerClass {

	public static void main(String[] args) {
		//局部内部类
		class InnerBase{
			int a;
		}
		class InnerSub extends InnerBase {
			int b;
		}
		//创建局部内部类的对象
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub对象的a和b属性是:" + is.a + "," + is.b);
		
	}

}
