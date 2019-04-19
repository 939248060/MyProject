package lianxi6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lianxi01 {

	static int num1;
	static int num2;
	public static void main(String[] args) {

		boolean flag = true;
		while(flag) {
		try {
			inputNum();
			flag = false;
		} catch (Exception e) {
			flag = true;
			System.out.println("输入的整数有误，请重新输入两个整数");
			continue;
		}
		}
		
	}
	public static void inputNum() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("输入的整数为：num1="+num1+" num2="+num2);
	}
}
