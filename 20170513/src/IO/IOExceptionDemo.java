package IO;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("demo.txt");
			fw.write("a" + LINE_SEPARATOR + "jdhdndc");
			// fw.close();

		} catch (Exception e) {
			System.out.println(e.toString());

		} finally {
			if (fw != null)

				try {
					fw.close();
				} catch (IOException e) {

					throw new RuntimeException("�ر�ʧ��");
				}
		}

	}

}