package Chapter6_Inner;

public class LocalInnerClass {

	public static void main(String[] args) {
		//�ֲ��ڲ���
		class InnerBase{
			int a;
		}
		class InnerSub extends InnerBase {
			int b;
		}
		//�����ֲ��ڲ���Ķ���
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub�����a��b������:" + is.a + "," + is.b);
		
	}

}