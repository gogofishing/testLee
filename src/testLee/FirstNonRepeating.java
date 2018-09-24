package testLee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeating {
	   public static void main (String[] args)
	    {
	        int arr[] = { 9, 4, 9, 6, 7, 4 };
	        int n = arr.length;  
	        System.out.print(firstNonRepeating(arr, n));
	    }

	private static int firstNonRepeating(int[] arr, int n) {
		// TODO Auto-generated method stub
		ArrayList myList = new ArrayList();
		for(int x : arr) {
			myList.add(x);
		}
		
		for(int i = 0; i <arr.length; i++) {
		if(Collections.frequency(myList, arr[i]) == 1)
			return arr[i];
		}
		throw new RuntimeException("error");
	}
}

























