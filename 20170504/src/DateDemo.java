import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time);
//		System.out.println();
		
		
		Date date = new Date();//��ǰ���ں�ʱ���װ��Date����
		System.out.println(date);//Fri May 05 03:20:51 CST 2017
		
		
		Date date2 = new Date(1493925821914l);//��ָ������ֵ��װ��Date����
		System.out.println(date2);
		
	}

}