package newFeatures;

/*
 * �������ģʽ
 * 
 * 
 */


class Single{
	//s��single��ĳ�Ա����
	
	static Single s = new Single();
	private Single(){
		
	}
	public static Single getInstance(){
		return s;
	}
	
}

//
class Single_2 {
	static Single_2 s = null;
	
	private Single_2() {
		
	}
	public static Single_2 getInstance() {
		if (s == null) {
			s = new Single_2();
		}
		return s;
	}
	
}

public class SingleDemo {

	public static void main(String[] args) {
		
//		Single ss = Single.getInstance();
		//Single.s
		Single ss = Single.s;
		
	}

}






