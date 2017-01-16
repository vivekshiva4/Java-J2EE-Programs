
public class One extends Thread {
	@Override
	public void run() {
		fun();
		fun1();
	}

	public  void fun() {
		String tname = Thread.currentThread().getName();

		System.out.println("value of i " + tname);

		for (int i = 0; i <= 10; i++)
			System.out.println(i + "--" + tname);
	}

	public  void fun1() {
		String tname = Thread.currentThread().getName();

		System.out.println("value of j " + tname);

		for (int j = 0; j <= 10; j++)
			System.out.println(j + "--" + tname);
	}
}
//there are priorities such as norm proirity=5 max priority=10 and min prioririties=1