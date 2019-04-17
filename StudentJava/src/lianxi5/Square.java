package lianxi5;

public class Square extends GeometricObject{

	
	
	public Square(int side) {
		super(side);
	}

	public void howToColor() {

		System.out.println("Color all "+side+" sides");
	}

}
