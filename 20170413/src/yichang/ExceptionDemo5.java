package yichang;

/*
 * 连接数据库
 * 查询
 * 关闭连接在finally中处理
 * 
 * */
class Demo_3{
	public int  show(int index) throws ArrayIndexOutOfBoundsException{
		if(index < 0) {
			throw new ArrayIndexOutOfBoundsException("越界");
		}
		int[] arr = new int[3];
		return arr[index];
		
	}
}
public class ExceptionDemo5 {
	
	public static void main(String[] args){
		Demo_3 d = new Demo_3();
		try{
			int num = d.show(1);
			System.out.println("num=" + num);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
			System.exit(0);//退出jvm，如果这样finally语句就不会执行
		}
		finally {
			System.out.println("finallt");
		}
		System.out.println("over");
	}
}
