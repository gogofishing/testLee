package testLee;

public class MyBubble {
	
	public static void sortB(int[] arr) {
		int length = arr.length;
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("Bubble sorting begin:");
		for(int i = length - 1; i > 0; i--) {
			for(int j = 0; j < length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
					
				}
				System.out.print("µÚ" + (length - i) + "sortºó: ");
				for(int x : arr) {
					 System.out.print(x);
				}
				System.out.println();
				
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5, 1, 4, 2, 8};
		sortB(arr);
	}

}
