
interface USB{
	public void open();
	
	public void close();
}

public class BookPC {
	
	public static void main(String[] args){
//		UPan u = new UPan();
//		useUSB(u);
		Mouse m = new Mouse();
		useUSB(m);
	}
	
	public static void useUSB(USB u){
		u.open();
		u.close();
		
	}
	
}

class UPan implements USB{
	public void open(){
		System.out.println("upan open");
	}
	
	public void close(){
		System.out.println("upan close");
	}
}

class Mouse implements USB{
	public void open(){
		System.out.println("mouse open");
	}
	public void close(){
		System.out.println("mouse close");
	}
}



























