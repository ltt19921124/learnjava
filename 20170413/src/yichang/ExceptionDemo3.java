package yichang;

/*
 * 
 * 负数角标异常在java总并没有定义过
 * 就按照java异常的创建思想，面向对象，将负数角标进行自定义描述，并封装成对象
 * 
 * 注意：让一个类称为异常类，必须继承异常体系，因为只有成为异常体系的子类才具有可抛性
 * 才可以被两个关键字所操作
 * 
 * 
 * 异常的分类：
 * 	1，被检测异常:只要是Exception和其子类都是，除了特殊子类RuntimeException体系
 * 		这种问题出现，希望在编译时就进行检测，让这种问题有对应的处理方式
 *  
 *  2，编译时不检测异常(运行时异常)：就是Exception中的RuntimeException和其子体系
 *  	这种问题的发生无法让功能继续，运算无法进行，更多是调用者的原因导致的，或者引发了内部状态
 *  	导致的。一般不处理，直接编译通过，在运行时，让调用者调用时强制停止，让调用者对代码进行修改
 *  
 *  自定义异常时，要么继承自Exception，要么继承自runtimeExeption
 *  
 *  throws：用在函数上，抛出的异常类，可以抛出多个，用逗号隔开
 *  
 *  throw：用在函数内，抛出的是异常对象。引发一个异常
 *  
 * */

class FushujiaobiaoException extends Exception{
	FushujiaobiaoException(){
		
	}
	FushujiaobiaoException(String msg){
		super(msg);
	}
}

class Demo_1 {
	public int method(int[] arr,int index) throws FushujiaobiaoException {
		
//		System.out.println(arr[index]);
//		System.out.println("haha");
		if(arr == null) {
			throw new NullPointerException("数组引用不能为空");
		}
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("数组" + index);
		}
		if (index < 0) {
			throw new FushujiaobiaoException("角标为负了");
		}
		return arr[index];
	}
}

public class ExceptionDemo3 {
	public static void main(String[] args) throws FushujiaobiaoException{
		int[] arr = new int[3];
//		arr = null;
		Demo_1 d = new Demo_1();
		int num = d.method(null, -30);
//		d.method(arr, 3);
		System.out.println("num=" + num);
		System.out.println("over");
		
	}
	
	
	
}
