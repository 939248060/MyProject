package lianxi2;

public class J110 {

	public static void main(String[] args) {
       
		System.out.println("图案一：");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		
		System.out.println("\n图案二：");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6-i+1;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		System.out.println("\n图案三：");
		for(int i=1;i<=6;i++) {
			for(int k=0;k<=6-i;k++)
				System.out.print("  ");
			for(int j=i;j>0;j--)
				System.out.print(j+" ");
			System.out.println();
		}
		
		System.out.println("\n图案四：");
		for(int i=1;i<=6;i++) {
			for(int k=0;k<=i-1;k++)
				System.out.print("  ");
			for(int j=1;j<=6-i+1;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
