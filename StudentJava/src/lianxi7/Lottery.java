package lianxi7;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int n1 = scan.nextInt();
		System.out.print("请输入二个数：");
		int n2 = scan.nextInt();
		if(n1==n2) {
			System.out.println("Exact Match : you win $10000");
		}else {
			String s1 = n1+"";
			String s2 = n2+"";
			int flag = 0;
			for (char ch1 : s1.toCharArray()) {
				for (char ch2 : s2.toCharArray()) {
					if(ch2 == ch1) {
						flag++;
						break;
					}
						
				}
			}
			if(flag == 0) {
				System.out.println("Sorry no match");
			}else if(flag==1) {
				System.out.println("Match one dight: you win &1000");
			}else{
				System.out.println("Match all dight: you win &3000");
			}
		}
		
	}

}
