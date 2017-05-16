package Chapter6;

class SingleTon {
	private static SingleTon instance;
	//˽�л�������
	private SingleTon() {
		
	}
	//����һ�����еľ�̬���������ڷ���SingleTon����
	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}


public class TestSingleTon {

	public static void main(String[] args) {
		
		//����SingleTon������ͨ����������ֻ��ͨ��getInstance
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		//�����true
		//˵����������ʵ������ͬһ������
		System.out.println(s1 == s2);//true
		
		
	}

}













