package lianxi2;

import java.util.Scanner;

public class J100 {

	public static void main(String[] args) {
	  float a,b,c,d,e,f,x,y;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a,b,c,d,e,f:");
      a = scan.nextFloat();
      b = scan.nextFloat();
      c = scan.nextFloat();
      d = scan.nextFloat();
      e = scan.nextFloat();
      f = scan.nextFloat();
      if(a*d-b*c==0) {
    	  System.out.println("The equation is no solution");
          return;
      }
      x = (e*d - b*f)/(a*d-b*c);
      y = (a*f - e*c)/(a*d-b*c);
      System.out.println("x is "+x+" y is "+y);
	}

}
