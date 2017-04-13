package DuoTai;

/*
 *多态时：
 * 1，成员变量
 * 		左边 左边
 *
 * 
 * 2，成员函数
 * 		左边 右边
 * 
 * 
 * 3，静态函数
 * 
 * 
 * */

class Fu{
	
	int num = 3;
	static void show(){
		System.out.println("fu show");
	}
}

class Zi extends Fu{
	
	int num = 4;
	static void show(){
		System.out.println("zi show");
	}
}

public class DuoTaiDemo3 {
	
	public static void main(String[] args){
		
//		Zi z = new Zi();
//		System.out.println(z.num);
		
		Fu f = new Zi();
//		System.out.println(f.num);//3，为什么是3？
		f.show();//zi show
		
	}
	
}















