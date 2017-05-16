package Chapter6_interface;

public class OutputFactory {
	
	public Output getOutput() {
		return new Printer();
	}

	public static void main(String[] args) {
		
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("轻量级企业应用实战");
		c.keyIn("权威指南");
		c.print();
		
	}

}
