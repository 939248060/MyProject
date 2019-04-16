package lianxi4;

class Arrays {
	private Arrays() {	}
	// 1:定义一个遍历数组的函数【a,b,c,d,e】
	public static void print(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("【");
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]+",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("】");
		System.out.println(sb);
	}
	// 2:定义一个求数组和的功能函数
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
		// 3:定义一个获取数组最大值的功能函数
	public static int getMax(int[] arr) {
		int max = 0;
		for (int i : arr) {
			if(i>max)
				max = i;
		}
		return max;
	}
		// 4:定义一个获取数组最大值角标的功能函数
	public static int getIndexMax(int[] arr) {
		int max = 0,maxIndex = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	// 5:定义一个返回 指定数在指定数组中包含的角标的功能函数
	public static int getIndex(int[] arr, int src) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == src)
				return i;
		}
		return 0;
	}
	
	public static void test(int[] arr) {
		
	}
	// 选择排序
	public static void selectSort(int[] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			max = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[max]) {
					max = j;
				}
			}
			if(max != i) {
				int temp = arr[max];
				arr[max] = arr[i];
				arr[i] = temp;
			}
				
		}
	}
	
	// 7：定义一个可以将整数数组进行反序的功能函数。
	public static void reverseSort(int[] arr) {
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--) {
			  int tmp = arr[j];
			  arr[j] = arr[i];
			  arr[i] = tmp;
		}
	}
	
	// 折半查找
	public static int halfSearch(int key, int[] arr) {
		int a = arr.length/2;
		int i =0,len=0;
		if(key<= arr[a]) {
			i = a;
			len = arr.length;
		}else {
			i=0;
			len = arr.length/2;
		}
		for(;i<len;i++) {
			if(arr[i] == key)
				return i;
		}
		return 0;
	}
	/*
	*/
}

public class J401 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 2, 3, 7, 4 };
		Arrays.print(arr);
		System.out.println();
		Arrays.selectSort(arr);
		Arrays.print(arr);

	}

}
