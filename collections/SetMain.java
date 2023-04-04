package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ar.add(34);
ar.add(67);
ar.add(34);
ar.add(36);
ar.add(67);
ar.add(72);
System.out.println(ar);

HashSet hash=new HashSet(ar);   // performance it will give more performance
System.out.println(hash);        // it won't allowed duplicates

LinkedHashSet lht=new LinkedHashSet(ar); //it follow insertion order
System.out.println(lht);

TreeSet ts=new TreeSet(ar);
System.out.println(ts);         //directly it gives sorting order
	}

}
