package lianxi7;

import java.util.Scanner;

public class StringManage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("字符串："+str+",长度为："+str.length()+",第一个字符为："+str.substring(0, 1));
	}

}
