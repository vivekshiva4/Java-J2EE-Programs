package comm;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector ar=new Vector();
		ar.add("vivek");
		ar.add(2052);
		ar.add('c');
		ar.add(25.2f);
		ar.add(4, true);
		
		System.out.println(ar);
		System.out.println(ar.size());//to know size of array
		System.out.println(ar.get(2));//to dispaly one value using index
		
		ar.remove(2);	//remove object by using index
		ar.remove(new Integer(2052));//removing interger value
		System.out.println(ar);
		
		ar.remove("vivek");
		System.out.println(ar);
		
		ar.add(1,"kittu"); //adding string to index
		ar.add("kittu");  // dublicates are allowed because of indexes.
		System.out.println(ar);
		


	}

}
