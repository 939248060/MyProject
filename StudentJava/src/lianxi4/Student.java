package lianxi4;

public class Student extends Person{

	final int CLASSONE = 1;
	final int CLASSTWO = 2;
	final int CLASSTHREE = 3;
	@Override
	public String toString() {
		return "Student [CLASSONE=" + CLASSONE + ", CLASSTWO=" + CLASSTWO + ", CLASSTHREE=" + CLASSTHREE + ", name="
				+ name + ", iphone=" + iphone + ", address=" + address + ", email=" + email + "]";
	}
	
}
