package yichang;


public class ExceptionDemo {
	public static void main(String[] args){
		
		int[] arr = new int[3];
		arr = null;
		System.out.println(arr[3]);//�Ǳ�Խ��
		
	}
	
	public static void sleep(int time){
		System.out.println("shui..." + time);
	}
	
}
