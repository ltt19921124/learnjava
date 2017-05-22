package Chapter10;

import java.util.Date;

public class TestNull {

	public static void main(String[] args) {
		Date d = null;
		try {
			System.out.println(d.after(new Date()));
		}
		catch (NullPointerException ne) {
			System.out.println("��ָ���쳣");
		}
		catch (Exception e) {
			System.out.println("δ֪�쳣");
			System.out.println("好");
		}
		

	}

}
