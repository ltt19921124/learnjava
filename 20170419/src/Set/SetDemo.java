package Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Hello");
		set.add("Hello");
		set.add("Hello");
		
		System.out.println("���ϵĳߴ�Ϊ��" + set.size());//���ϵĳߴ�Ϊ��1
		
		System.out.println("�����е�Ԫ��Ϊ��" + set.toString());//�����е�Ԫ��Ϊ��[Hello]
		
	}

}
