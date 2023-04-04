package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector vector=new Vector();
vector.add(34);
vector.add(37);
vector.add(56);
System.out.println(vector);
vector.addElement(43);
System.out.println(vector);
System.out.println(vector.capacity());
System.out.println(vector.contains(34));
System.out.println(vector.elementAt(0));

Comparator<Integer> compare=new Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

};
vector.sort(compare);
System.out.println(vector);
	}
	
}


