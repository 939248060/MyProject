package lianxi3;

import java.util.Scanner;

public class QuadraticEquation {

	private float a,b,c;
	
	public QuadraticEquation(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getA() {
		return a;
	}

	public float getB() {
		return b;
	}

	public float getC() {
		return c;
	}

	public int getDiscriminant() {
		float i = b*b-4*a*c;
		return (int) i;
	}
	public float getRoot1() {
		return (float) ((-b+Math.sqrt(b*b-4*a*c)) / (2*a));
	}
	public float getRoot2() {
		return (float) ((-b-Math.sqrt(b*b-4*a*c)) / (2*a));
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("请输入啊a,b,c的值：");
		QuadraticEquation qde = new QuadraticEquation(scan.nextFloat(), scan.nextFloat(), scan.nextFloat());
		if(qde.getDiscriminant()>0) {
			System.out.println(qde.getRoot1());
			System.out.println(qde.getRoot2());
		}else if(qde.getDiscriminant() == 0) {
			System.out.println(qde.getRoot1());
		}else {
			System.out.println("The equation is no roots");
		}
	}

}
