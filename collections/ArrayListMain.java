package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<Integer>();
list.add(34);
list.add(43);
list.add(18);
System.out.println(list);

Comparator<Integer> compare=new Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
};
list.sort(compare);
System.out.println(list);



ArrayList list2=new ArrayList();
list2.add(32);
list2.add(23);
list2.add(43);
System.out.println(list2);

//Iterate
CopyOnWriteArrayList<String> list5=new CopyOnWriteArrayList<String>();
list5.addAll(list2);
for(Object object: list5) {
System.out.println(object);
list5.add("gana");
	
};
System.out.println(list5);
//list2.add(23);
//System.out.println(list2);

	}

}
