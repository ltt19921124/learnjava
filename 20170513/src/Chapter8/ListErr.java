package Chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListErr {

	public static void main(String[] args) {
		//编译时不检测类型可能导致的问题。
		List strList = new ArrayList();
		strList.add("权威指南");
		strList.add("宝典");
		strList.add("应用实践");
		//"不小心"把一个Integer对象放进去了
		strList.add(5);//1
		for (int i = 0;i < strList.size();i++) {
			//List存放的都object对象，所以必须强制转换
			// 下面代码会导致类型转换异常java.lang.ClassCastException
			String str = (String) strList.get(i);//2
		}

	}

}
