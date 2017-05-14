package Chapter5_Extends;

class Fu1 {
	
	void show() {
		System.out.println("fu1 show");
	}
}

class Zi1 extends Fu1 {
	void show() {
		System.out.println("zi1 show");
	}
}

public class DuoTaiDemo2 {

	public static void main(String[] args) {
		
		Fu1 fu1 = new Zi1();
		fu1.show();
	}

}
