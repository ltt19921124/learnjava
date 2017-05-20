package Chapter9;

import java.util.Scanner;

public class TestScannerLong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			System.out.println("¼üÅÌÊäÈëµÄÊÇ:" + sc.nextLong());
		}

	}

}
