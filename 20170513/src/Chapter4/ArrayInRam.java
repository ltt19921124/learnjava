package Chapter4;

public class ArrayInRam {

	public static void main(String[] args) {
		
		int[] a = {5,7,20};
		int[] b = new int[4];
		
		System.out.println("b����ĳ���:" + b.length);//4
		
		//for���a�����Ԫ��
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[1]);
		}
		//for���b����ĳ���
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//��b����ָ��a����ָ�������
		b = a;
		System.out.println("b����ĳ���Ϊ:" + b.length);//3
		
	}

}