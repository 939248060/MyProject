package lianxi4;

public class Employee extends Person{

	public String accommodation;
	public float staff;
	public String employeeDate;
	@Override
	public String toString() {
		return "Employee [accommodation=" + accommodation + ", staff=" + staff + ", employeeDate=" + employeeDate
				+ ", name=" + name + ", iphone=" + iphone + ", address=" + address + ", email=" + email + "]";
	}
	
}
