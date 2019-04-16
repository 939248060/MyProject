package lianxi2;


public class J106 {

	public static void main(String[] args) {

		for(int i=100,j=1;i<1000;i++) {
			if(i % 5 == 0 && i % 6 == 0) {
				System.out.print(i+" ");
				j++;
				if(j>10) {
					System.out.println();
					j = 1;
				}
			}
		}
	}

}
