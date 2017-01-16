package comn;

public class Test {

	public static void main(String[] args) {
		MultiThread m=new MultiThread();
		Thread t=new Thread(m);
		Thread t1=new Thread(m);
		t.start();
		t1.start();

	}

}
