package collections;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list=new LinkedList();
list.add(34);
list.add(24);
list.add(76);
System.out.println(list);
list.addFirst("hello");
System.out.println(list);
list.addLast("hi");    //addlast and add are same only
System.out.println(list);
System.out.println(list.contains("hi"));
System.out.println(list.getFirst());  //print first element
System.out.println(list.getLast());   // print last element
   
//iterate

for (Object object : list) {
	System.out.println(object);	
	
	LinkedList<Integer> list1=new LinkedList<Integer>();
	list1.add(34);
	list1.add(24);
	list1.add(76);
	System.out.println(list1);
	
	Comparator<Integer> compare=new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1.compareTo(o2);
		}
		
	};
	list1.sort(compare);
System.out.println(list1);
	
}

	}

}
