package Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 *@author Tian Lu
 *王hashset存储Person对象，若姓名年龄相同视为同一个人
 *
 */
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		/*
		 * hashset数据结构是哈希表，所以存储元素的时候用的是hashcode方法来
		 * 确定位置，如果位置相同，用equals方法确定元素是否相同
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




