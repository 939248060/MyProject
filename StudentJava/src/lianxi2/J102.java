package lianxi2;

import java.util.Scanner;

public class J102 {

	public static void main(String[] args) {
		float w,price;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入重量：");
		w = scan.nextFloat();
		if(w>0 && w <= 1) {
			price = 3.5f;
		}else if(w <=3) {
			price = 5.5f;
		}else if(w<=10) {
			price = 8.5f;
		}else if(w <= 20) {
			price = 10.5f;
		}else {
			System.out.println("The package cannot be shipped!");
			return;
		}
		System.out.println("运输成本为："+price);
	}

}
