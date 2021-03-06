package Static;



public class BinTree {
	private int value;
	private BinTree lchild;
	private BinTree rchild;

	public BinTree(int c) {
		value = c;
	}

	// ��������ݹ�
	public static void preOrder(BinTree t) {
		if (t == null) {
			return;
		}
		System.out.print(t.value + " ");
		preOrder(t.lchild);
		preOrder(t.rchild);
	}

	// ��������ݹ�
	public static void InOrder(BinTree t) {
		if (t == null) {
			return;
		}
		InOrder(t.lchild);
		System.out.print(t.value + " ");
		InOrder(t.rchild);
	}

	// ��������ݹ�
	public static void PostOrder(BinTree t) {
		if (t == null) {
			return;
		}
		PostOrder(t.lchild);
		PostOrder(t.rchild);
		System.out.print(t.value + " ");
	}

	// ��������ǵݹ�
//	public static void preOrder2(BinTree t) {
//		Stack<BinTree> s = new Stack<BinTree>();
//		while (t != null || !s.empty()) {
//			while (t != null) {
//				System.out.print(t.value);
//				s.push(t);
//				t = t.lchild;
//			}
//			if (!s.empty()) {
//				t = s.pop();
//				t = t.rchild;
//			}
//		}
//	}

	// ��������ǵݹ�
//	public static void InOrder2(BinTree t) {
//		Stack<BinTree> s = new Stack<BinTree>();
//		while (t != null || !s.empty()) {
//			while (t != null) {
//				s.push(t);
//				t = t.lchild;
//			}
//			if (!s.empty()) {
//				t = s.pop();
//				System.out.print(t.value);
//				t = t.rchild;
//			}
//		}
//	}

	// ��������ǵݹ�
//	public static void PostOrder2(BinTree t) {
//		Stack<BinTree> s = new Stack<BinTree>();
//		Stack<Integer> s2 = new Stack<Integer>();
//		Integer i = new Integer(1);
//		while (t != null || !s.empty()) {
//			while (t != null) {
//				s.push(t);
//				s2.push(new Integer(0));
//				t = t.lchild;
//			}
//			while (!s.empty() && s2.peek().equals(i)) {
//				s2.pop();
//				System.out.print(s.pop().value);
//			}
//
//			if (!s.empty()) {
//				s2.pop();
//				s2.push(new Integer(1));
//				t = s.peek();
//				t = t.rchild;
//			}
//		}
//	}

	public static void main(String[] args) {
		
		BinTree b1 = new BinTree(1);
		BinTree b2 = new BinTree(2);
		BinTree b3 = new BinTree(3);
		BinTree b4 = new BinTree(4);
		BinTree b5 = new BinTree(5);
		BinTree b6 = new BinTree(6);
		BinTree b7 = new BinTree(7);

		/**
		 * a / / b c / / d e
		 */
		b1.lchild = b2;
		b1.rchild = b3;
//		b2.lchild = b4;
//		b2.rchild = b5;
//		b4.lchild = b6;
//		b6.lchild = b7;
		
		BinTree.preOrder(b1);
		System.out.println();
//		BinTree.preOrder2(b1);
//		System.out.println();
		BinTree.InOrder(b1);
		System.out.println();
//		BinTree.InOrder2(b1);
//		System.out.println();
		BinTree.PostOrder(b1);
		System.out.println();
//		BinTree.PostOrder2(b1);
	}
}