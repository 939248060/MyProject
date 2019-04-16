package lianxi2;

public class J112 {

	public static void main(String[] args) {

		boolean flog = true;
		int len=0;
		for(int i=2;i<1000;i++) {
			flog = true;
			for(int j = 2;j <= Math.sqrt(i);j++)
			if(i % j == 0) {
				flog = false;
				break;
			}
			if(len>7) {
				System.out.println();
				len = 0;
			}
			if(flog) {
			System.out.print(i+" ");
			len++;
			}
			
			
		}
	}


}
