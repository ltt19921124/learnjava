package Chapter9;

import java.util.Scanner;

public class TestScannerKeyBoard {

	public static void main(String[] args) {
		
		//System.in�����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		//������������һ�н�ֻ�ѻس�����Ϊ�ָ���
		sc.useDelimiter("\n");
		while (sc.hasNext()) {
			//���������
			System.out.println("�������������Ϊ:" + sc.next());
		}
		

	}

}
