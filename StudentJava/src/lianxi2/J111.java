package lianxi2;

import java.util.Scanner;

public class J111 {

	public static void main(String[] args) {

		int n = 8,sum,num,i,j,k,l,len;
		for( i = 0;i < n;i++) {
			for( l=0;l<n-i;l++)
				System.out.print("    ");
			for( j = i+1,sum=1;j>0;j--) {
				len = (sum+"").length();
				System.out.print((len ==1 ?"   ":len == 2?"  ":len == 3?" ":"")+sum);
				sum *= 2;
			}
			for( k=2,sum /= 2;k<=i+1;k++) {
				sum /= 2;
				len = (sum+"").length();
				System.out.print((len ==1 ?"   ":len == 2?"  ":len == 3?" ":"")+sum);
				
			}
			System.out.println();
			
		}
	}

}
