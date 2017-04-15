package duoxiancheng;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * 卖票示例：四个窗口
 *  并发，
 * 
 * 
 * */

class Ticket implements Runnable {
	private int num = 500;
	Object obj = new Object();
	
	public void run() {
		synchronized (obj) {
			while(true) {
				if(num > 0) {
					try{Thread.sleep(500);}catch(InterruptedException e){}
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





