package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSam  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<EmployeeEx> hash=new HashSet<EmployeeEx>();
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

hash.add(e);
hash.add(e1);
hash.add(e2);
hash.add(e3);
System.out.println(hash);

//iterate
for (EmployeeEx employeeEx : hash) {        //ctrl+space
	System.out.println(employeeEx);	
}

TreeSet<EmployeeEx> ts=new TreeSet<EmployeeEx>(hash);    //imlements will give in EmployeeEx class this is done by 
System.out.println(ts);                                   // using comparable

	}

}
