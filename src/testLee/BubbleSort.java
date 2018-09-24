package testLee;

public class BubbleSort {
	
	public int a = 0;

	public static int[] bubbleSort(int[] arr) {
		int length = arr.length;
		for(int i = 0; i < length - 1; i ++) {
			for(int j = i ; j < length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] selectSort(int[] arr) {
		int length = arr.length;
		for(int i = 0; i < length - 1; i++) {
			int k = i;
			
			for(int j = i + 1; j < length; j++) {
				if(arr[j] < arr[k]) {
					k = j;
				}
			}
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static int[] insertSort(int[] arr) {
		int length = arr.length;
		for(int i = 1; i < length; i++) {
			int current = arr[i];
			for(int j = i -1; j >= 0; j--) {
				if(arr[i] < arr[j]) {
					arr[i] = arr[j];
					arr[j] = current;
				}
			}
		}
		
		return arr;
	}
	

	public static void main(String[] args) {
		int[] arr = {3,1,5,7,9,2,6,4,8};
//		arr = bubbleSort(arr);
//		arr = selectSort(arr);
		arr = insertSort(arr);
		for(int x : arr) {
			System.out.println(x);
		}
	}

	
	int b = a + 1;
}
