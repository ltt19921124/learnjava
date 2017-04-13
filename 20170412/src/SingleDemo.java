

class Single{
	
	private static Single s = new Single();
	
	private Single(){
		
	}
	public static Single getInstance(){
		return s;
	}
	
}

class SingleDemo {

	public static void main(String[] args) {
		
		Single ss = Single.getInstance();
		Single ss1 = Single.getInstance();
		System.out.println(ss == ss1);//true
//		Single ss1 = Single.s;
		
	}

}
