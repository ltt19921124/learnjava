package Chapter5_Constructor;

public class Apple {
	
	public String name;
	public String color;
	public double weight;
	
	//无参的构造器
	public Apple() {
		
	}
	//两个参数的构造器
	public Apple(String name,String color) {
		this.name = name;
		this.color = color;
	}
	//三个参数的构造器
	public Apple(String name,String color,double weight) {
		this(name,color);
		this.weight = weight;
	}
	
}
