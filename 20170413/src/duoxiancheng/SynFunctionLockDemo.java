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

class Ticket_1 implements Runnable {
	private int num = 500;
	Object obj = new Object();
	boolean flag = true;
	public  void run() {//同步函数
		if(flag) 
			while(true) {
				synchronized(obj) {
				if(num > 0) {
					try{Thread.sleep(100);}catch(InterruptedException e){}
					System.out.println(Thread.currentThread().getName() + "..obj.."+num--);
				}
					
				}
			}
		else
			while(true) {
				show();
			}
		
	}
	
	
	public synchronized void show() {
		if(num > 0) {
			try{Thread.sleep(100);}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName() + "..function.."+num--);
		}
	}
	
}

class SynFuntionLockDemo {
	
	public static void main(String[] args) {
		Ticket_1 t = new Ticket_1();//创建一个线程任务对象
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
//		Thread t3 = new Thread(t);
//		Thread t4 = new Thread(t);
		
		t1.start();
		
		t.flag = false;
		t2.start();
//		t3.start();
//		t4.start();
		
	}
	
}





