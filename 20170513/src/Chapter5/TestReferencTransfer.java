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
		System.out.println("swap方法里，a属性值是:" + dw.a + ",b的值是:" + dw.b);
	}
	
	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("交换结束后，a属性的值是:" + dw.a + ",bshux的值为:" + dw.b);
		
	}

}
