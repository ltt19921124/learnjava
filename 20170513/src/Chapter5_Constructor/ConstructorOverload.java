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
		
		//ͨ���޲εĹ�������������
		ConstructorOverload oc1 = new ConstructorOverload();
		//ͨ���вεĹ�������������
		ConstructorOverload oc2 = new ConstructorOverload("������",2000);
		System.out.println(oc1.name + " " + oc1.count);//null 0
		System.out.println(oc2.name + " " + oc2.count);//������ 2000
		
		
	}

}








