package System;

import java.util.Date;

public class SystemDemo {

	public static void main(String[] args) {
		
		double a = Math.pow(10, 2);
//		System.out.println(a);
		
		
		for(int i = 0;i < 10;i++){
			double b = Math.floor(Math.random() * 10);
			System.out.println(b);
		}
		
		long time = System.currentTimeMillis();//1492858121368
		System.out.println(time);
		
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(1951921368);
		System.out.println(date2);
	}

}