package Chapter5_encapsulation;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(1000);
		System.out.println("未能设置age属性时:" + p.getAge());
		//成功修改age的值
		p.setAge(30);
		//因为上面成功设置了p的age属性，故此处输出30
		System.out.println("成功设置属性后:" + p.getAge());
		//不能直接操作p的name属性，只能通过其对于的setter方法
		//因为"李刚"字符串长度满足2~6，所以可以成功设置
		p.setName("李刚李刚李刚");
		System.out.println("成功设置name属性后:" + p.getName());
		
		
	}

}
