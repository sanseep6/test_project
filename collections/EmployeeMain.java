package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

import methodoverloading.Employee;


public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<EmployeeEx> emplist=new LinkedList<EmployeeEx>();
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

emplist.add(e);
emplist.add(e1);
emplist.add(e2);
emplist.add(e3);
System.out.println(emplist);

//iterate
for (EmployeeEx employeeEx : emplist) {
	System.out.println(employeeEx.getEmployee_id()+" "+employeeEx.getEmployee_name());	
}

//sorting
//Comparator<EmployeeEx> compare=new Comparator<EmployeeEx>() {
//
//	@Override
//	public int compare(EmployeeEx o1, EmployeeEx o2) {
//		// TODO Auto-generated method stub
//		return o1.compareTo(o2);
//	}
//
//
//	
//	
//};
//emplist.sort(compare);
//System.out.println(emplist);

Comparator<EmployeeEx> compare1= (EmployeeEx k1,EmployeeEx k2)->k1.employee_id-k2.employee_id;
emplist.sort(compare1);
System.out.println(emplist);

	}

	
	}


