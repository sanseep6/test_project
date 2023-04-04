package collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,EmployeeEx> map=new HashMap<String,EmployeeEx>();

EmployeeEx e=new EmployeeEx();
e.setEmployee_id(34);
e.setEmployee_name("sandeep");

EmployeeEx e1=new EmployeeEx();
e1.setEmployee_id(14);
e1.setEmployee_name("puli");

EmployeeEx e2=new EmployeeEx();
e2.setEmployee_id(24);
e2.setEmployee_name("goutham");

EmployeeEx e3=new EmployeeEx();
e3.setEmployee_id(44);
e3.setEmployee_name("gana");

map.put("1", e);
map.put("2", e1);
map.put("3", e2);
map.put("4", e3);
System.out.println(map);

System.out.println(map.keySet());
for (String string : map.keySet()) {
	System.out.println(string);	
}
System.out.println(map.values());
for (EmployeeEx str : map.values()) {
	System.out.println(str);	
}
System.out.println(map.entrySet());
Set<HashMap.Entry<String,EmployeeEx>> entry=map.entrySet();
for (Entry<String, EmployeeEx> entry2 : entry) {
	System.out.println(entry2.getKey()+" "+entry2.getValue());	
}
}


	}


