package lianxi5;

public class Bmw extends Car{

	public Bmw(String name,String color) {
		super(name,color);
	}
	public Bmw() {
		super();
	}
	@Override
	public void execute() {
		System.out.println("品牌："+name+"  颜色："+color);
	}
}
