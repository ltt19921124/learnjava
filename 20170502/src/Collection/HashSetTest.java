package Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 *@author Tian Lu
 *��hashset�洢Person����������������ͬ��Ϊͬһ����
 *
 */
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		/*
		 * hashset���ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ���õ���hashcode������
		 * ȷ��λ�ã����λ����ͬ����equals����ȷ��Ԫ���Ƿ���ͬ
		 * 
		 */
		
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName() + "...." + p.getAge());
		}
	}

}




