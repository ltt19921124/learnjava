package Chapter7;

import java.util.TreeSet;

public class TestTreeSetCommon {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		//Ìí¼ÓÔªËØ
		ts.add(5);
		ts.add(2);
		ts.add(10);
		ts.add(-9);
		//Êä³ö
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(4));
		System.out.println(ts.tailSet(5));
		System.out.println(ts.subSet(-3, 4));
		
	}

}
