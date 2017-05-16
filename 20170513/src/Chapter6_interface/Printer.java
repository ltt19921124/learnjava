package Chapter6_interface;

interface Product {
	int getProduceTime();
}

public class Printer implements Output,Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;

	

	@Override
	public void out() {
		while (dataNum > 0) {
			
			System.out.println("打印机打印" + printData[0]);
			//把作业队列整体前移以为，并将剩下的作业书减一
			System.arraycopy(printData,1,printData,0,--dataNum);
			
		}
		
	}

	@Override
	public void getData(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			//把打印数据添加到队列里，已保存数据的数量加1
			printData[dataNum++] = msg;
		}
	}
	

	@Override
	public int getProduceTime() {
		
		return 45;
	}
	public static void main(String[] args) {
		//创建一个Printter对象，当成Output使用
		Output o = new Printer();
		o.getData("轻量级企业应用实战");
		o.getData("struts2权威指南");
		o.out();
		o.getData("基于。。的Ajax宝典");
		o.getData("Ruby on Rails敏捷开发实战");
		o.out();
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;
		
	}
	
}









