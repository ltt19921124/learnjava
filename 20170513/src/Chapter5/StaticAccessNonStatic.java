package Chapter5;

public class StaticAccessNonStatic {
	
	public void info() {
		System.out.println("�򵥵�info����");
	}

	public static void main(String[] args) {
		//main����ʱ��̬�ģ�erinfo()����ʱ�Ǿ�̬�ģ����ʻ����
//		info();//Cannot make a static reference to the non-static method info() from the type
		
		new StaticAccessNonStatic().info();
	}

}
