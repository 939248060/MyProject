package lianxi2;

import java.util.Scanner;

public class J104 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		n = scan.nextInt();
		System.out.println("Is " + n + " divisable by 5 and 6? " + (n % 5 == 0 && n % 6 ==0));
		System.out.println("Is " + n + " divisable by 5 or 6? " + (n % 5 == 0 || n % 6 ==0));
		System.out.println("Is " + n + " divisable by 5 and 6? " + (n % 5 != 0 && n % 6 ==0 || n % 5 == 0 && n % 6 !=0));
	}


}
