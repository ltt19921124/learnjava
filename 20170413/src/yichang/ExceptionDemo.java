package yichang;

/*
 * 
 * 用异常类对问题进行描述
 * 不同的问题用不同的类进行具体的描述，角标越界，空指针异常
 * 异常体系：
 * 问题很多，描述的类也很多
 * 将其共性进行抽取，形成了异常体系
 * 
 * 最终问题(不正常情况)就分成了两大类
 * Throwable
 * 	   |---1，不可处理的 。Error
 * 
 * 	   |---2，可处理的。 Exception
 * 
 * 
 * */
public class ExceptionDemo {
	public static void main(String[] args){
		
		int[] arr = new int[3];
		arr = null;
		System.out.println(arr[2]);//角标越界
		sleep(-5);
		
	}
	
	public static void sleep(int time){
		if(time < 0) {
			//处理办法
			try {
				throw new Futime();
			} catch (Futime e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//代表着时间为负的情况，这个对象中会包含着问题的名称，位置
			
		}
		if(time > 10000) {
			//处理办法
			try {
				throw new Bigtime();
			} catch (Bigtime e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("睡觉..." + time);
	}
	
}

class Futime extends Exception{
	
	
}

class Bigtime extends Exception{
	
}





















