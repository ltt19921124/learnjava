package Chapter8;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList();
		strList.add("权威指南");
		strList.add("宝典");
		strList.add("实战");
//		strList.add(5);//添加了泛型，这里不能这样使用
		for (int i =0;i < strList.size();i++) {
			//下面代码无需强制类型转换
			String str = strList.get(i);
		}

	}

}
