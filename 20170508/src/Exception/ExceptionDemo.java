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
			//����취
//			�׳�  new FuTime();//java���쳣Ҳ�Ƕ���
		}
		if(time > 0) {
			//����취
//			�׳�  new BigTime();
		}
		
		System.out.println("˯..." + time);
	}

}
class FuTime{
	
}
class BigTime{
	
}












