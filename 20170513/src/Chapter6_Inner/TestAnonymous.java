package Chapter6_Inner;

interface Product {
	
	public double getPrice();
	public String getNmae();
	
	
}

public class TestAnonymous {
	public void test(Product p) {
		System.out.println("������һ��" + p.getNmae() + ",������" + p.getPrice());
	}

	public static void main(String[] args) {
		
		TestAnonymous ta = new TestAnonymous();
		//����test��������Ҫ����һ��Product�������˴�����������ʵ�����ʵ��
		ta.test(new Product() {
			public double getPrice() {
				return 567.8;
			}
			@Override
			public String getNmae() {
				
				return "AGP�Կ�";
			}
		});
		
	}

}
