package Chapter5_Extends;

class BaseClass {
	
	public int a = 5;

}

class SubClass extends BaseClass {
	
	public int a = 7;
	public void accessOwner() {
		System.out.println(a);
	}
	public void accessBase() {
		
		//ͨ��super�����ʷ��������߶����Ӧ�ĸ������
		System.out.println(super.a);
		
	}
	public static void main(String[] args) {
		
		SubClass sc = new SubClass();
		sc.accessOwner();
		sc.accessBase();
		
	}
}
