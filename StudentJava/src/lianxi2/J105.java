package lianxi2;

import java.util.ArrayList;
import java.util.Scanner;

public class J105 {

	public static void main(String[] args) {
		int n,mZieo=0,sZieo=0,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer,the input ends if it is 0:");
		while (true) {
			n = scan.nextInt();
			if(n == 0) break;
			if(n > 0) {
				mZieo++;
			}else {
				sZieo++;
			}
			sum +=n;
		}
		if(mZieo+sZieo ==0 ) {
			System.out.println("No number are enterd except 0");
			return;
		}
		System.out.println("The number of positives is "+mZieo);
		System.out.println("The number of negatives is "+sZieo);
		System.out.println("The tatol is "+sum);
		System.out.println("The average is "+(float)sum / (mZieo+sZieo));
	}

}
