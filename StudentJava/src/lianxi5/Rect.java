package lianxi5;

public class Rect extends MyShape {

	float weight,height;
	public float getArea() {
		return weight*height;
	}

	public float getLength() {
		return (weight+height)*2;
	}

}
