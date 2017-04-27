package Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Hello");
		set.add("Hello");
		set.add("Hello");
		
		System.out.println("集合的尺寸为：" + set.size());//集合的尺寸为：1
		
		System.out.println("集合中的元素为：" + set.toString());//集合中的元素为：[Hello]
		
	}

}
