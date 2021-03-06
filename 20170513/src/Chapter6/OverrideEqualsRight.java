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
		//只有当obj是Person2对象
		if (obj != null && obj instanceof Person2) {
			Person2 person2Obj = (Person2)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
			if (this.getIdStr().equals(person2Obj.getIdStr())) {
				return true;
			}
		}
		return false;
	}
	
}

public class OverrideEqualsRight {

	public static void main(String[] args) {
		
		Person2 p1 = new Person2("孙悟空","12343433433");
		Person2 p2 = new Person2("孙行者","12343433433");
		Person2 p3 = new Person2("孙悟饭","99933433");
		//p1和p2deidStr相等，所以true
		System.out.println("p1和p2是否相等?:" + p1.equals(p2));//true
		System.out.println("p2和p3是否相等?:" + p2.equals(p3));//false
		
	}

}












