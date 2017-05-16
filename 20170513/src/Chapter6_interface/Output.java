package Chapter6_interface;

public interface Output {
	//接口里面定义的属性只能是常量
	int MAX_CACHE_LINE = 50;
	//接口里定义的只能是public的抽象方法
	void out();
	
	
	void getData(String msg);

}
