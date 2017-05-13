package Chapter5;

public class TestBlock {

	public static void main(String[] args) {
		
		{
			int a;
			a = 5;
			System.out.println("代码块局部变量a的值:" + a);
		}
//		System.out.println(a);//a已经被释放了，不存在，故而没法访问
	}

}
