package yichang;

/*
 * 
 * ���쳣��������������
 * ��ͬ�������ò�ͬ������о�����������Ǳ�Խ�磬��ָ���쳣
 * �쳣��ϵ��
 * ����ܶ࣬��������Ҳ�ܶ�
 * ���乲�Խ��г�ȡ���γ����쳣��ϵ
 * 
 * ��������(���������)�ͷֳ���������
 * Throwable
 * 	   |---1�����ɴ���� ��Error:���������⣬һ�㲻����Դ���ֱ���޸Ĵ��룬��Ӧ����ͼ����
 * 
 * 	   |---2���ɴ���ġ� Exception:
 * 
 * �߱������ԣ�Throwable���������඼�߱�������,Error����Exception�������⣬��Ӧ���׳�
 * ���д���
 * ��ô���ֿ����ԣ�ͨ�������ؼ���������
 * 1��Throws
 *		 
 * 2,Throw
 * 
 * */
public class ExceptionDemo {
	public static void main(String[] args){
		
		int[] arr = new int[3];
		arr = null;
		System.out.println(arr[2]);//�Ǳ�Խ��
		sleep(-5);
		
	}
	
	public static void sleep(int time){
		if(time < 0) {
			//����취
			try {
				throw new Futime();
			} catch (Futime e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//������ʱ��Ϊ�����������������л��������������ƣ�λ��
			
		}
		if(time > 10000) {
			//����취
			try {
				throw new Bigtime();
			} catch (Bigtime e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("˯��..." + time);
	}
	
}

class Futime extends Exception{
	
	
}

class Bigtime extends Exception{
	
}





















