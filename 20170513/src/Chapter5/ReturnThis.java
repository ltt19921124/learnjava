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
			.grow();//����������ͬһ������
		System.out.println("rt������ֵ��:" + rt.age);
	}

}