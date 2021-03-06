package duoxiancheng;

/*
 * 需求：
 * 两个储户存钱：每个人都去银行存钱每次存100，共存三次
 * 
 * 同步函数的锁是什么？
 * 
 * 一定不是obj，是this
 * 
 * 同步代码块的锁是任意的对象
 * 
 * 开发式用同步函数还是同步代码块：
 * 同步代码块
 * 
 * */

class Bank {
	private int sum;
//	private Object obj = new Object();
	public synchronized void add(int num) {//同步函数
//		synchronized(obj) {
			
			sum += num;
			System.out.println("sum=" + sum);
//		}
	}
}

class Cus implements Runnable {
	private Bank b = new Bank();
	public void run() {
		for(int x = 0;x < 3;x++){
			b.add(100);
		}
	}
	
}

public class BankDemo {
	
	public static void main(String[] args) {
		Cus c = new Cus();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}
	
}






