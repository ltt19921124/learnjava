package Chapter6_Inner;

interface Product {
	
	public double getPrice();
	public String getNmae();
	
	
}

public class TestAnonymous {
	public void test(Product p) {
		System.out.println("购买了一个" + p.getNmae() + ",花掉了" + p.getPrice());
	}

	public static void main(String[] args) {
		
		TestAnonymous ta = new TestAnonymous();
		//调用test方法，需要传入一个Product参数，此处传入其匿名实现类的实例
		ta.test(new Product() {
			public double getPrice() {
				return 567.8;
			}
			@Override
			public String getNmae() {
				
				return "AGP显卡";
			}
		});
		
	}

}
