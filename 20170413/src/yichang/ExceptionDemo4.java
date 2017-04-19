package yichang;

/*
 * try{
 * 	//需要被检测异常的代码
 * }catch(异常类  变量){
 * 
 * 		//处理异常的代码
 * }finall{
 * 		
 * 		//一定会执行的代码
 * }
 * 
 * */
class FushujiaobiaoException_1 extends Exception{
	FushujiaobiaoException_1(){
		
	}
	FushujiaobiaoException_1(String msg){
		super(msg);
	}
}

class Demo_2 {
	public int method_1(int[] arr,int index) throws FushujiaobiaoException_1 {
		
//		System.out.println(arr[index]);
//		System.out.println("haha");
		if (arr == null) {
			throw new FushujiaobiaoException_1("没有任何数组实体");
		}
		if (index < 0) 
			throw new FushujiaobiaoException_1("角标为负了");
			
		return arr[index];
	}
}

public class ExceptionDemo4 {
	public static void main(String[] args) {
		int[] arr = new int[3];
//		arr = null;
		Demo_2 d = new Demo_2();
		
		try{
			int num = d.method_1(arr, -30);
	
//			d.method(arr, 3);
			System.out.println("num=" + num);
			
		}
		catch(FushujiaobiaoException_1 e){
			System.out.println("负数角标异常！！！");
			e.printStackTrace();
		}
		/*
		catch(Exception e){
			多catch情况父类的catch放在最后，否则编译失败
		}
		*/
			System.out.println("over");
		
	}
	
	
	
}







