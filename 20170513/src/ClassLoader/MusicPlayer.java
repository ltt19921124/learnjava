package ClassLoader;

public class MusicPlayer {
	public void print() {
		System.out.println("Hi,I'm Music Player!");
	}
	
	public static void loadClass() throws ClassNotFoundException {
		
		Class<?> clazz = Class.forName("classloader.MusicPlayer");
		ClassLoader classLoader = clazz.getClassLoader();
		System.out.printf("ClassLoader is %s",classLoader.getClass().getSimpleName());
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		MusicPlayer.loadClass();
		System.out.println("k");
	}
}





