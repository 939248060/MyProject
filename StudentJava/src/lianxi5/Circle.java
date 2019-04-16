package lianxi5;

public class Circle extends MyShape{

	float radius;
	final float PI = 3.14F;
	public float getArea() {
		return radius*radius*PI;
	}

	public float getLength() {
		return 2*radius*PI;
	}

}
