package Chapter5_Extends;

public class Apple extends Fruit{

	public static void main(String[] args) {
		
		//����Apple����
		Apple a = new Apple();
		//Apple������û��weight����
		//��Ϊ������Fruit�࣬���Կ��Է��ʸ��������
		a.weight = 56;
		a.info();
	}

}
