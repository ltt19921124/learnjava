package duoxiancheng;

//����ʽ
class Single {
	private static final Single s = new Single();
	private Single(){
		
	}
	public static Single getInstance() {
		return s;
	}
}
//����ģʽ

class Single_1{
	private static Single_1 s1 = null;
	
	private Single_1(){
		
	}
	public static Single_1 getInstance_1() {
		if(s1 == null) 
			s1 = new Single_1();
			return s1;
		
	}
	
}

public class SingleDemo {
	
	public static void main(String[] args) {
		
	}
	
}









