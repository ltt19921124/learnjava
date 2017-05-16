package Chapter6;

class Apple {
	private String color;
	private double weight;
	public Apple() {
		
	}
	
	public Apple(String color,double weight) {
		this.color = color;
		this.weight = weight;
	}
	//在Object的方法打印出类名+@+hashcode值
	//覆盖toString方法，有自己实现
	public String toString() {
		return "一个苹果,颜色是:" + color + ",重量是:" + weight;
	}
	
}

	
class TestToString {

	public static void main(String[] args) {
		
		Apple a = new Apple("红色",5.68);
		System.out.println(a);
		
	}

}
