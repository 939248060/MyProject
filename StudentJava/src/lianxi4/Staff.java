package lianxi4;

public class Staff extends Employee {

	public String jobName;

	@Override
	public String toString() {
		return "Staff [jobName=" + jobName + ", accommodation=" + accommodation + ", staff=" + staff + ", employeeDate="
				+ employeeDate + ", name=" + name + ", iphone=" + iphone + ", address=" + address + ", email=" + email
				+ "]";
	}

}
