package Chapter6;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println("������Ϊ:" + name);
	}
}

public class PrintObject {
	
	public static void main(String[] args) {
		
		//����һ��Person���󣬽�֮����p����
		Person p = new Person("�����");
		//���д������������һ�£�
		System.out.println(p);//Chapter6.Person@15db9742
		System.out.println(p.toString());//Chapter6.Person@15db9742

		
	}

}