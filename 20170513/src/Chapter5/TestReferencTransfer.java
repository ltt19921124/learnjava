package Chapter5;

class DataWrap{
	public int a;
	public int b;
}

public class TestReferencTransfer {

	public static void swap(DataWrap dw) {
		int temp = dw.a;
		dw.a = dw.b;
		dw.b = temp;
		System.out.println("swap�����a����ֵ��:" + dw.a + ",b��ֵ��:" + dw.b);
	}
	
	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("����������a���Ե�ֵ��:" + dw.a + ",bshux��ֵΪ:" + dw.b);
		
	}

}
