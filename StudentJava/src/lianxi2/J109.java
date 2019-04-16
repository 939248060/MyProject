package lianxi2;

import java.util.Scanner;

public class J109 {

	public static void main(String[] args) {
     
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of line:");
		n = scan.nextInt();
		for(int i = 0;i < n;i++) {
			for(int l=0;l<n-i;l++)
				System.out.print("  ");
			for(int j = i+1;j>0;j--)
				System.out.print(j+" ");
			for(int k=2;k<=i+1;k++)
				System.out.print(k+" ");
			System.out.println();
			
		}
	}

}
