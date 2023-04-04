package collections;

import java.util.LinkedList;

import methodoverloading.Employee;

public class EmployeeEx implements Comparable<EmployeeEx> {

	int employee_id;
	String employee_name;
	
	
	
	
	

	@Override
	public String toString() {
		return "EmployeeEx [employee_id=" + employee_id + ", employee_name=" + employee_name + "]";
	}


	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeEx e=new EmployeeEx();
e.setEmployee_id(23);
e.setEmployee_name("sandeep");
System.out.println(e.getEmployee_id()+" "+e.getEmployee_name());


	}


	public int compareTo(EmployeeEx o2) {
		// TODO Auto-generated method stub
		return this.employee_id-o2.employee_id;
	


	
	}

}
