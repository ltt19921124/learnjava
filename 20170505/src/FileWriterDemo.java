import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		
		//创建一个可以往文件 中写入字符数据的字符输出流对象
		/*
		 * 既然是往一个文件中写入文字数据，那么在创建对象时，就必须明确该文件(用于存储数据的目的地)
		 * 
		 */
		
		FileWriter fw = new FileWriter("demo.txt",true);
		
		//调用writer对象的writer(string)方法，写入数据
		//其实数据就写入到了临时存储区域中
		//构造函数中加入true，可以对文件进行续写
		
		fw.write("abcde" + LINE_SEPARATOR + "nhaha");
//		fw.write("xixi");

		//刷新。将数据直接写入到目的地中
//		fw.flush();
		
		fw.close();
		
//		fw.write("cc");//java.io.IOException
		
		
	}

}












