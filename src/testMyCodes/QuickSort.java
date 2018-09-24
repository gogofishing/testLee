package testMyCodes;

public class QuickSort {
	public static void qSort(int[] arr, int low, int high) {
		if(arr.length <= 0) return;
		if(low >= high) return;
		int left = low;
		int right = high;
		
		int temp = arr[left];
		while (left < right) {
			while (left < right && arr[right] > temp) {
				right--;
			}
			arr[left] = arr[right];
			while (left < right && arr[left] <= temp) {
				left++;
			}
			arr[right] = arr[left];
		}
		arr[left] = temp;
		qSort(arr, low, left - 1);
		qSort(arr, left + 1, high);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,5,7,9,2,6,4,8};
		qSort(arr,0,arr.length-1);
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
