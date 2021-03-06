package Chapter5_Extends;

class Root {
	
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	
	public Root() {
		
		System.out.println("Root的无参数构造函数");
	}
}

class Mid extends Root{
	
	static{
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid() {
		System.out.println("Mid的无参数构造器");
	}
	
	public Mid(String msg) {
		//通过this调用同一类中重载的构造器
		this();
		System.out.println("Mid的带参数的构造器，其参数值为:" + msg);
	}
}

class Leaf extends Mid{
	
	static{
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	public Leaf() {
		super("Struts2权威指南");
		System.out.println("执行Leaf的构造器");
	}
	
}

class Test_1{
	
	public static void main(String[] args) {
		
		new Leaf();
		new Leaf();
		
	}
	
}





















