package Chapter6_interface;

public interface A {
	
	int PROP_A = 5;
	void testA();

}

interface B {
	int PROP_B = 6;
	void testB();
}

interface C extends A,B {
	
	int PROP_C = 7;
	void testC();
	
}