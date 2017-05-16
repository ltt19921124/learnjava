package Chapter6;

class Person2{
	private String name;
	private String idStr;
	public Person2() {
		
	}
	public Person2(String name,String idStr) {
		this.name = name;
		this.idStr = idStr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public boolean equals(Object obj) {
		//ֻ�е�obj��Person2����
		if (obj != null && obj instanceof Person2) {
			Person2 person2Obj = (Person2)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
			if (this.getIdStr().equals(person2Obj.getIdStr())) {
				return true;
			}
		}
		return false;
	}
	
}

public class OverrideEqualsRight {

	public static void main(String[] args) {
		
		Person2 p1 = new Person2("�����","12343433433");
		Person2 p2 = new Person2("������","12343433433");
		Person2 p3 = new Person2("����","99933433");
		//p1��p2deidStr��ȣ�����true
		System.out.println("p1��p2�Ƿ����?:" + p1.equals(p2));//true
		System.out.println("p2��p3�Ƿ����?:" + p2.equals(p3));//false
		
	}

}











