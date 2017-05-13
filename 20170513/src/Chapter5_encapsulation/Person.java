package Chapter5_encapsulation;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() > 6 || name.length() < 2) {
			System.out.println("您设置的人名不符合要求");
			return;
		}
		else{
			this.name = name;
		}
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 100 || age < 0){
			System.out.println("您设置的年龄不符合要求");
		}
		else{
			this.age = age;
		}
		
	}
	
	

}
