package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
//		show(coll);
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		show(c1,c2);
		
		
	}
	
	public static void show(Collection c1,Collection c2){
		//��c1����Ԫ��
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//��c2����Ԫ��
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		
		//��ʾaddAll
//		c1.addAll(c2);//��c2�е�Ԫ�����ӵ�c1��
//		System.out.println("c1=" + c1);
		
		//��ʾremoveAll
		//removeAll:�����������е�Ԫ�شӵ��÷������Ǹ�������ɾ��
//		boolean b = c1.removeAll(c2);
//		System.out.println("removeAll:" + b);//removeAll:true
//		System.out.println("c1:" + c1);//c1:[abc1, abc3, abc4]
		
		//containsAll
//		boolean b = c1.containsAll(c2);
//		System.out.println("containsAll:" + b);//false
		
		//retainAll
		boolean b = c1.retainAll(c2);//ȡ����
		System.out.println(b);//true
		System.out.println("c1:" + c1);
		
		
	}
	
	public static void show(Collection coll) {
		//1,����Ԫ�� add
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
//		System.out.println(coll);//[abc1, abc2, abc3]
		
		//2��ɾ��Ԫ��
//		coll.remove("abc2");//���ϵ�remove��ı䳤��
		//��ռ���
//		coll.clear();
		
		
		System.out.println(coll.contains("abc4"));//false
		System.out.println(coll.isEmpty());//false
		System.out.println(coll);//����������е�Ԫ��
		
	}

}





