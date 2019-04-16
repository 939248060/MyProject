package lianxi2;

public class J113 {

	public static void main(String[] args) {

		int n1=1,n2=2;
		float sum=0;
		while(n2 <= 625) {
			sum += 1.0 / (Math.sqrt(n1)+Math.sqrt(n2));
			n1 = n2;
			n2++;
		}
		System.out.println(sum);
	}

}
