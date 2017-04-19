package aa;

class Demo3 {
	int x = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d = new Demo3();
		d.x = 9;
		show(d);
		System.out.println(d.x);
		
	}
	public static void show(Demo3 d){
		d.x = 14;
	}

}
