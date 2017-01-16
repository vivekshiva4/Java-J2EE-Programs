package dom;

public class Test {

	public static void main(String[] args) {
		Sleep s=new Sleep();
		Thread t=new Thread(s);
		Thread t1=new Thread(s);
		
		t.start();
		t1.start();
		

	}

}
