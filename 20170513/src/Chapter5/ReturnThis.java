package Chapter5;

public class ReturnThis {
	public int age;
	
	public ReturnThis grow() {
		age++;
		return this;
	}

	public static void main(String[] args) {
		ReturnThis rt = new ReturnThis();
		
		rt.grow()
			.grow()
			.grow();//可连续调用同一个方法
		System.out.println("rt的属性值是:" + rt.age);
	}

}
