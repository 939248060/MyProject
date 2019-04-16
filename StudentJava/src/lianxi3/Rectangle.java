package lianxi3;

public class Rectangle {

	public double width=1;
	public double height=1;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
    public double getArea() {
    	return width*height;
    }
    public double getPerimeter() {
    	return width*height*2;
    }
	public static void main(String[] args) {
     Rectangle rtl = new Rectangle(4,40);	
     System.out.println(rtl.getArea());
     System.out.println(rtl.getPerimeter());
     Rectangle rt2 = new Rectangle(3.5,39.5);	
     System.out.println(rt2.getArea());
     System.out.println(rt2.getPerimeter());
	}

}
