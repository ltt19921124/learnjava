import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
//		System.out.println();
		
		
		Date date = new Date();//当前日期和时间封装成Date对象
		System.out.println(date);//Fri May 05 03:20:51 CST 2017
		
		
		Date date2 = new Date(1493925821914l);//将指定毫秒值封装成Date对象
		System.out.println(date2);
		
	}

}
