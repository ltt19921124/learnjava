package Chapter4;

public class TestArray {

	public static void main(String[] args) {

		int[] arr;

		arr = new int[]{5,6,8,20};
		
		Object[] object;
		object = new String[] {"java","���"};//�Ӹ��࣬ʵ��������ת��
		
		Object[] obj2;
		obj2 = new Object[] {"java","���"};
		
//		int[] arr1 = new int[3];
//		int[] arr1 = new int[]{2,3,4};
//		System.out.println(arr1[2]);
		
		int[] price = new int[5];
		
		for (int i = 0; i < price.length; i++) {
			System.out.println(price[i]);
		}

	}

}