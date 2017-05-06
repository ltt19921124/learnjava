import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		//1，创建一个读取字符数据的流对象
		//在创建读取对象时，必须要明确被读取的文件，一定要确定该文件是存在的
		
		FileReader fr = new FileReader("demo.txt");
		
		int ch = 0;
		while((ch=fr.read()) != -1) {
			System.out.println((char)ch);
		}
		//用Reader中的read方法读取字符
//		int ch = fr.read();
//		System.out.println((char)ch);
//		
//		int ch1 = fr.read();
//		System.out.println(ch1);
//		
//		int ch2 = fr.read();
//		System.out.println(ch2);
		
		
		fr.close();
	}

}
