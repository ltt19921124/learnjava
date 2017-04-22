package generic;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericDemo_2 {

	public static void main(String[] args) {
		
		TreeSet<Person> ts  =new TreeSet<Person>();
		ts.add(new Person("lisi",21));
		ts.add(new Person("zhangsan",23));
		ts.add(new Person("wangwu",24));
		ts.add(new Person("zuaoliu",25));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p);
		}
		
	}

}
