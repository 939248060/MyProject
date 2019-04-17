package lianxi5;

public class Benz extends Car{

	public Benz() {
		super();
	}

	public Benz(String name, String color) {
		super(name, color);
	}

	@Override
	public void execute() {
		System.out.println("品牌："+name+"  颜色："+color);
	}

	
	
}
