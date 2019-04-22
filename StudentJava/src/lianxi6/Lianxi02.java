package lianxi6;

public class Lianxi02 {

	public static void main(String[] args) {

		int arr[] = new int[100];
		int i = 0;
		try {
			while(true)
				arr[i++] = (int) (Math.random()*10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outof Boundso");
		}
	}

}
