package Chapter6_interface;

public class ProcessArray {
	
	public void process(int[] target,Command cmd) {
		
		cmd.process(target);
	}

}