package lianxi4;

public class Faculty extends Employee {

	public String workDate;
	public String range;
	@Override
	public String toString() {
		return "Faculty [workDate=" + workDate + ", range=" + range + ", accommodation=" + accommodation + ", staff="
				+ staff + ", employeeDate=" + employeeDate + ", name=" + name + ", iphone=" + iphone + ", address="
				+ address + ", email=" + email + "]";
	}
}
