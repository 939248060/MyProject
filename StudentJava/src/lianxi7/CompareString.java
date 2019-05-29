package lianxi7;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入第一个字符串：");
		String str1 = scan.nextLine();
		System.out.print("请输入第二个字符串：");
		String str2 = scan.nextLine();
		int len = str1.length();
		String str3 = str1.replace(str2, "");
		if(str3.length() != len) {
			System.out.println(str2+" is a substring of "+str1);
		}else {
			System.out.println(str2+" is not a substring of "+str1);
		}
	}

}
