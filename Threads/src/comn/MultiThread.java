package comn;

public class MultiThread extends Thread {

	@Override
	public void run() {
		fun();
		fun1();
	}

	public synchronized void fun() {
		String tname = Thread.currentThread().getName();

		System.out.println("value of i " + tname);

		for (int i = 0; i <= 10; i++)
			System.out.println(i + "--" + tname);
	}

	public synchronized void fun1() {
		String tname = Thread.currentThread().getName();

		System.out.println("value of j " + tname);

		for (int j = 0; j <= 10; j++)
			System.out.println(j + "--" + tname);
	}
}
//syncronised is used for excuting the threads sqeuential in multi threading