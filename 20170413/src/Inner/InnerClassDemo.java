package Inner;

class Outer{
	int num = 3;
	
	class Inner{//ÄÚ²¿Àà
		void show(){
			System.out.println("show run..." + num);
		}
	}
	public void method(){
		Inner in = new Inner();
		in.show();
	}
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		
		out.method();
	}

}
