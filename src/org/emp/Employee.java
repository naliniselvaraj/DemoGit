package org.emp;
public class Employee {
	
	
	private void projectName() {

		System.out.println("Facebook");
	}
	
	
	
private void empId() {
System.out.println("Employee Id is abc");
	}
private void empName() {
System.out.println("Emp Name is Nalini");
}
private void empDob() {
System.out.println("Emp DOB is 18-04-1995");
}
private void empPhone() {
System.out.println("Emp phone no is 9943967725");
}
private void empEmail() {
System.out.println("Emp email id is naliniselvaraj1895@gmail.com");
}
private void empAddress() {
System.out.println("Emp addresss is Mugalivakkam");
}
public static void main(String[] args) {
	Employee em = new Employee();
	em.empId();
	em.empName();
	em.empDob();
	em.empPhone();
	em.empEmail();
	em.empAddress();	
}
}
