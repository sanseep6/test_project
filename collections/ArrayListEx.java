package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
list.add(34);
list.add("hello");
list.add(74);
System.out.println(list);

//remove (start from 0)
list.remove(2);
System.out.println(list);
System.out.println(list.remove(0));

ArrayList list2=new ArrayList();
list2.addAll(list);
System.out.println(list2);

list.contains(list2);
System.out.println(list);

list.indexOf(1);
System.out.println(list);

System.out.println(list.isEmpty());
System.out.println(list.size());
	}

}
