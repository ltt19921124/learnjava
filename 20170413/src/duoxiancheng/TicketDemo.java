package duoxiancheng;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * ��Ʊʾ�����ĸ�����
 *  ������
 * 
 * ͬ���ĺô���������̰߳�ȫ����
 * ͬ���ı׶ˣ���Խ�����Ч��
 * ͬ����ǰ�᣺�ж���̲߳�ʹ��ͬһ���� 
 * ͬһ����
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
		Ticket t = new Ticket();//����һ���߳��������
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
		/*
		 * �̳߳��ְ�ȫ����ԭ��
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





