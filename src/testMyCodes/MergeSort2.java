package testMyCodes;

public class MergeSort2 {
	
	public static void main(String[] args) {
		int[] x = { 6, 2, 4, 1, 5, 9 };
		int[] sorted = new int[x.length];
		mergeSort(x, 0, x.length, sorted);
		for(int i : x)
		System.out.println(i);
	}
	
	private static void mergeSort(int[] unsorted, int left, int right, int[] sorted) {
		// TODO Auto-generated method stub
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(unsorted, left, mid, sorted);
			mergeSort(unsorted, mid + 1, right, sorted);
			merge(unsorted, left, mid, right, sorted);
		}
		
	}

	private static void merge(int[] unsorted, int left, int mid, int right, int[] sorted) {
		// TODO Auto-generated method stub
		int i = left, j = mid;
		int k = 0;
		while (i < mid && j < right) {
			if(unsorted[i] < unsorted[j]) {
				sorted[k] = unsorted[i];
				k++;
				i++;
			}
			else {
				sorted[k] = unsorted[j];
				k++;
				j++;
			}
		}
		while(i < mid) {
			sorted[k] = unsorted[i];
			k++;
			i++;
		}
		while(j < right) {
			sorted[k] = unsorted[j];
			j++;
			k++;
		}
		for(int v = 0; v < k; v++) {
			unsorted[left + v] = sorted[v];
		}
		
	}


}
