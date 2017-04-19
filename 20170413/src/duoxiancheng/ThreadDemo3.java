package duoxiancheng;

/*
 * 
 * 实现Runnable接口的好处：
 * 1，将线程的任务从线程的子类中分离出来，进行了单独的封装
 * 	   按照面向对象的思想将任务封装成对象
 * 2，避免了java单继承的局限性
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
