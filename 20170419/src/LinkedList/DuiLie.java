package LinkedList;

import java.util.LinkedList;

public class DuiLie {

private LinkedList link;
	
	public DuiLie(){
		link = new LinkedList();
	}
	//�������Ԫ�ع���
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	//ȡ��Ԫ�ع���
	public Object myGet(){
		return link.removeFirst();
	}
	
	public boolean isNull() {
		return link.isEmpty();
	}
}
