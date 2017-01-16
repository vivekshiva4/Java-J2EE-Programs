import java.io.FileReader;

public class FileReaderclass {

	public static void main(String[] args) {

		try {

			FileReader f = new FileReader("D:\\vivek1.txt");
			int i;
			while ((i = f.read()) != -1) {
				System.out.print((char) i);
			}
			f.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
