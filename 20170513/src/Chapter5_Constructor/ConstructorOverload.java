package Chapter5_Constructor;

public class ConstructorOverload {
	
	public String name;
	public int count;
	
	

	public ConstructorOverload() {
		
	}

	public ConstructorOverload(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}



	public static void main(String[] args) {
		
		//通过无参的构造器创建对象
		ConstructorOverload oc1 = new ConstructorOverload();
		//通过有参的构造器创建对象
		ConstructorOverload oc2 = new ConstructorOverload("轻量级",2000);
		System.out.println(oc1.name + " " + oc1.count);//null 0
		System.out.println(oc2.name + " " + oc2.count);//轻量级 2000
		
		
	}

}









