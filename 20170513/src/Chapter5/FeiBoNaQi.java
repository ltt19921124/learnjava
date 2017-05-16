package Chapter5;

public class FeiBoNaQi {
	/*
	 * 兔子问题，也叫斐波那契数列
	 * 
	 */
	public static int fn(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}else {
			return fn(n-1) + fn(n-2);
		}
	}
//	public static int sn(int n) {
//		return 
//	}

	public static void main(String[] args) {
		
		int n = 10;
//		System.out.println(fn(n));
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			sum = sum + fn(i);
		}
		System.out.println(sum);
		
	}

}
