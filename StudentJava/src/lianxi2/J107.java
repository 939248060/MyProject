package lianxi2;

public class J107 {

	public static void main(String[] args) {

		for(int i=100,j=1;i<200;i++) {
			if((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
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
