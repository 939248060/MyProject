package lianxi2;

import java.util.Scanner;

public class J103 {

	public static void main(String[] args) {
		float bd1,bd2,bd3;
		float arr[] = new float[3];
		Scanner scan = new Scanner(System.in);
		System.out.print("请分别输入三角形的边长：");
		arr[0] = scan.nextFloat();
		arr[1] = scan.nextFloat();
		arr[2] = scan.nextFloat();
		if(arr[0]+arr[1]>arr[2] && arr[0]+arr[2]>arr[1] && arr[1]+arr[2]>arr[0]) {
			System.out.println("三角形的周长为："+(arr[0]+arr[1]+arr[2]));
		}else {
			System.out.println("输入值不合法");
		}
		
	}


}
