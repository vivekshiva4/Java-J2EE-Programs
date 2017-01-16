import comn.MultiThread;

public class Test {

	public static void main(String[] args) {
		One o=new One();
		Thread t=new Thread(o);
		Thread t1=new Thread(o);
		t.start();
		
		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);

	}

}
