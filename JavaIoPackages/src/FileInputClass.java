import java.io.FileInputStream;

public class FileInputClass {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\vivek.txt");
			int i;

			while ((i = f.read()) != -1) {
				System.out.print((char) i);
			}
			f.close();
		} catch (Exception e) {
			System.out.println("file not found " + e);
		}
	}

}
