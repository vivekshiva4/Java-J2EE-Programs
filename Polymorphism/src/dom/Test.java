package dom;


public class Test {

	public static void main(String[] args) {
		Vechile v;
		v=new TwoWheeler();
		v.register();
		v.display();
		
		v=new ThreeWheeler();
		v.register();
		v.display();

	}

}
