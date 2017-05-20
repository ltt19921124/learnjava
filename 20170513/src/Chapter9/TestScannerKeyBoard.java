package Chapter9;

import java.util.Scanner;

public class TestScannerKeyBoard {

	public static void main(String[] args) {
		
		//System.in代表标准输入，就是键盘输入
		Scanner sc = new Scanner(System.in);
		//下面增加下面一行将只把回车键作为分隔符
		sc.useDelimiter("\n");
		while (sc.hasNext()) {
			//输出输入项
			System.out.println("键盘输入的内容为:" + sc.next());
		}
		

	}

}
