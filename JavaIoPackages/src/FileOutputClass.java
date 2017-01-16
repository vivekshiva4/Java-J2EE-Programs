import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputClass {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\vivek.txt");
			FileOutputStream f1 = new FileOutputStream("D:\\xyz.txt");
			int i;
			while ((i = f.read()) != -1) {
				f1.write(i);
				System.out.print((char) i);
			}
			f.close();
			f1.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
