package duoxiancheng;

/*
 * 
 * ʵ��Runnable�ӿڵĺô���
 * 1�����̵߳�������̵߳������з�������������˵����ķ�װ
 * 	   ������������˼�뽫�����װ�ɶ���
 * 2��������java���̳еľ�����
 * 
 * */

class Demo_2 implements Runnable {
	
	public void run(){
		for(int x = 0;x < 7;x++){
			System.out.println(Thread.currentThread().getName() + "..." +  x);
		}
	}
}

public class ThreadDemo3 {
	
	public static void main(String[] args){
		Demo_2 d1 = new Demo_2();
		Demo_2 d2 = new Demo_2();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}
	
}
