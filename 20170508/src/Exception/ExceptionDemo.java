package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 */
		int[] arr = new int[1024*1024*800];
		arr = null;
		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
		
//		sleep(-5);
	}
	
	
	public static void sleep(int time) {
		if(time < 0) {
			//处理办法
//			抛出  new FuTime();//java中异常也是对象
		}
		if(time > 0) {
			//处理办法
//			抛出  new BigTime();
		}
		
		System.out.println("睡..." + time);
	}

}
class FuTime{
	
}
class BigTime{
	
}












