package Chapter6_Inner;

interface Teachable {
	void work();
}

public class Programmer {
	
	public String name;
	public Programmer(){
		
	}
	public Programmer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void work() {
		System.out.println(name + "在等下认真敲键盘...");
	}

}
