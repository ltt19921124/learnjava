package Chapter8;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList();
		strList.add("Ȩ��ָ��");
		strList.add("����");
		strList.add("ʵս");
//		strList.add(5);//����˷��ͣ����ﲻ������ʹ��
		for (int i =0;i < strList.size();i++) {
			//�����������ǿ������ת��
			String str = strList.get(i);
		}

	}

}
