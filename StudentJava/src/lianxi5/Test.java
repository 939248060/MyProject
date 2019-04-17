package lianxi5;


public class Test {

	public static void main(String[] args) {

		int x = 0;
		while (x < 100) {
			Car c = CarFactory();
			c.execute();
			x++;
		}	
	}

	public static Car CarFactory() {
		Car car = null;
		int type = (int) (Math.random()*2);
		switch (type) {
		case 0:
			car = new Bmw("宝马","红色");
			break;
		case 1:
			car = new Benz("奔驰","白色");
			break;
		case 2:
			car = new Bsj("保时捷","粉色");
			break;
		}
		return car;
	}
}
