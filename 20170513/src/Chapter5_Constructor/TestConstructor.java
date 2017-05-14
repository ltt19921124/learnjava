package Chapter5_Constructor;

public class TestConstructor {
	
	public String name;
	public int count;
	
	public TestConstructor(String name,int count) {
		
		//this代表当前对象
		this.name = name;
		this.count = count;
	}

	public static void main(String[] args) {
		//使用自定义构造器来创建对象
		//系统会对该对象执行自定义的初始化
		TestConstructor tc = new TestConstructor("权威指南",2000); 
		//输出该对象的name和count属性
		System.out.println(tc.name);
		System.out.println(tc.count);
		
	}

}
