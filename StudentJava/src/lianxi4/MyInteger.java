package lianxi4;

public class MyInteger {

	int value;
	
	public MyInteger(int value) {
		this.value = value;
	}

	
	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if(value %2 ==0)
			return true;
		return false;
	}
	
	public boolean isOdd() {
		if(value % 2 != 0)
			return true;
		return false;
	}
	
	public boolean isPrime() {
		for(int i=2;i<value;i++) {
			if(value % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int value) {
		if(value %2 ==0)
			return true;
		return false;
	}
	
	public static boolean isOdd(int value) {
		if(value % 2 != 0)
			return true;
		return false;
	}
	
	public static boolean isPrime(int value) {
		for(int i=2;i<value;i++) {
			if(value % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt) {
		if(myInt.value %2 ==0)
			return true;
		return false;
	}
	
	public static boolean isOdd(MyInteger myInt) {
		if(myInt.value % 2 != 0)
			return true;
		return false;
	}
	
	public static boolean isPrime(MyInteger myInt) {
		for(int i=2;i<myInt.value;i++) {
			if(myInt.value % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int value) {
		if(value == this.value) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(MyInteger myInt) {
		if(myInt.value == this.value) {
			return true;
		}else {
			return false;
		}
	}

	public static int parseInt(char[] ch) {
		int n=0;
		for (char c : ch) {
			n =n*10+(c-'0');
		}
		return n;
	}
	
	public static int parseInt(String s) {
		int n=0;
		for(int i=0;i<s.length();i++) {
			n =n*10+(s.charAt(i)-'0');
		}
		return n;
	}
	
	public static void main(String[] args) {

		MyInteger my = new MyInteger(12);
		System.out.println("value："+my.getValue());
		System.out.println("是否为偶数："+my.isEven());
		System.out.println("是否为奇数："+my.isOdd());
		System.out.println("是否为素数："+my.isPrime());
		System.out.println("静态方法调用");
		System.out.println("是否为偶数："+MyInteger.isEven(13));
		System.out.println("是否为奇数："+MyInteger.isOdd(13));
		System.out.println("是否为素数："+MyInteger.isPrime(13));
		System.out.println("转化为正整数："+MyInteger.parseInt("5443"));
	}

}
