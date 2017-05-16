package Chapter6;

import java.util.Arrays;

class Person3{
	private int age;
	public Person3() {
		
	}
	public Person3(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class TestFinalReference {

	public static void main(String[] args) {
		
		final int[] arr = {5,6,12,9};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		arr[2] = -8;
		System.out.println(Arrays.toString(arr));
		//������� �Ƿ�����Ϊ��ͼ��final���¸�ֵ
//		arr = null;
		
		final Person3 p = new Person3(45);
		p.setAge(23);
		System.out.println(p.getAge());
		//�Ƿ���䣬��Ϊ��p���¸�ֵ��
//		p = null;
		
		
	}

}















