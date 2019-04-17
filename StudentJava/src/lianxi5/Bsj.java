package lianxi5;

public class Bsj extends Car{

	public Bsj() {
		super();
	}

	public Bsj(String name, String color) {
		super(name, color);
	}

	@Override
	public void execute() {
		System.out.println("品牌："+name+"  颜色："+color);
	}

	
	
}
