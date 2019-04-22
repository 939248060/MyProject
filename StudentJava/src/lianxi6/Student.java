package lianxi6;

public class Student {

	public void speak(int m) throws MyException {
		if(m>1000) {
			throw new MyException("参数m的值大于1000");
		}else {
			System.out.println("m的值为："+m);
		}
		
	}
	
	//测试程序
	public static void main(String sre[]) {
		Student st = new Student();
		try {
			st.speak(2000);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
