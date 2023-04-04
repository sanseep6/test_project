package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hashset=new HashSet();
hashset.add(45);
hashset.add(43);
hashset.add(56);



System.out.println(hashset);
System.out.println(hashset.contains(45));
System.out.println(hashset.isEmpty());
System.out.println(hashset.size());

//iterate
for (Object object : hashset) {
	System.out.println(object);
	
}
TreeSet ts=new TreeSet(hashset);
ts.addAll(hashset);
System.out.println(ts);
	}

}
