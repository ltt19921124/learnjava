package duoxiancheng;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * 卖票示例：四个窗口
 *  并发，
 * 
 * 同步的好处：解决了线程安全问题
 * 同步的弊端：相对降低了效率
 * 同步的前提：有多个线程并使用同一个锁 
 * 同一个锁
 * 
 * */

class Ticket implements Runnable {
	private int num = 500;
	Object obj = new Object();
	
	public void run() {
	
			while(true) {
				synchronized(obj) {
					if(num > 0) {
						try{Thread.sleep(100);}catch(InterruptedException e){}
						System.out.println(Thread.currentThread().getName() + "..sale.."+num--);
					}
				}
			}
		
	}
}

public class TicketDemo {
	
	public static void main(String[] args) {
		Ticket t = new Ticket();//创建一个线程任务对象
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
		/*
		 * 线程出现安全问题原因：
		 * 
		 * 
		 * */
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}





