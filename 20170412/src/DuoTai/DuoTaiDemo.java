
/*
 * ����Ķ�̬�ԣ�
 * 
 *è  x = new è();
 *����  x = new è();
 * 
 * ������߽ӿڵ�����ָ���������
 * һ������������̬
 * 
 * */


package DuoTai;


class DuoTaiDemo {
	public static void main(String[] args){
//		Cat c = new Cat();
//		c.eat();
//		Cat c1 = new Cat();
//		Dog d = new Dog();
//		method(d);
//		method(d);
		
//		Cat c = new Cat();
		Animal a = new Cat();//�Զ��������������ƶ����й��ܵķ���
		a.eat();
		//����ת�ͣ��Ϳ��Լ���ʹ����������й���
		
		Cat c = (Cat)a;//����ת�ͣ�ǿ��ת��
		c.catchMouse();
		c.eat();
		//����ת�ͣ���ʼ���ն�������������������͵�ת��
		
//		Animal a1 = new Dog();
//		Cat c1 = (Cat)a1;//����ת���쳣
		
	}
	
	public static void method(Cat c){
		c.eat();
	}
	
	public static void method(Dog d){
		d.eat();
	}
	public static void method(Animal a){
		a.eat();
	}
}











