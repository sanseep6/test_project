package collections;

import java.util.Stack;

public class StackEx {

	private static String object;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st=new Stack();
st.add(34);
st.add("hello");
st.add(76);
System.out.println(st);
st.addElement(56);
System.out.println(st);
System.out.println(st.capacity());
System.out.println(st.contains(44));
System.out.println(st.elementAt(0));

System.out.println(st.elements());  //enumiration
System.out.println(st.firstElement());
for (Object object : st) {
	System.out.println(object);
	
}
System.out.println(st.empty());
System.out.println(st.get(3));    
st.insertElementAt(55,2);
System.out.println(st);
System.out.println(st.lastIndexOf(55));

//Stack<String> st1=new Stack<String>();
//st1.add("hello");
//st1.add("hi");
//st1.add("hii");
//System.out.println(st1);

//for (String string : st1) {      //string as startswith method but object doesn't have startswith method
//if(string.startsWith("hi"));
//System.out.println(string);
//}

Stack st1=new Stack();
st1.add("hello");
st1.add("hi");
st1.add("hii");
System.out.println(st1);

for (Object object : st1) {      //foreach : ctrl+space bar
	String str=(String)object;
	if(str.startsWith("hi"));    // in this case we are taken object then it is converted into string because 
	System.out.println(str);       // string as startswith method where as object doesn't containing
	
	
}


	
}
	}

