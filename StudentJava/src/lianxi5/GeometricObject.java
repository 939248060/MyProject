package lianxi5;

public class GeometricObject implements Colorable{

	public int side=0;

	public GeometricObject(int side) {
		this.side = side;
		if(side>0) {
			howToColor();
		}
	}

	@Override
	public void howToColor() {
		System.out.println("Color all "+side+"sides");
	}
	

}
