package Chapter6_Inner;

public class TeachableProgrammer_1 extends Programmer {
	
	public TeachableProgrammer_1() {
		
	}
	public TeachableProgrammer_1(String name){
		super(name);
	}
	private void teach() {
		System.out.println(getName() + "教师在讲台讲课...");
	}
	private class Closure implements Teachable {
		
		/*
		 * 非静态内部类回调外部类实现work方法，非静态内部类引用的作用仅仅是
		 * 向客户提供一个回调外部类的途径
		 */
		public void work() {
			teach();
		}
		//
		public Teachable getCallbackReference() {
			return new Closure();
		}
	}

}





