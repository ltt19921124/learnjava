package Chapter7;

import java.util.HashMap;

public class NullHashMap {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		//������keyΪnull�ļ�ֵ�Է���HashMap��
		hm.put(null, null);
		hm.put(null, null);//�޷�����ֵ�Է��룬��Ϊ�Ѿ���һ��keyΪnull
		//��һ��value�ļ�ֵ�Է���HashMap��
		hm.put("a", null);
		System.out.println(hm);

	}

}
