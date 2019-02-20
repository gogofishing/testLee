package testMyCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresofaSortedArray {

	public static void main(String[] args) {
		int[] A = {-4,-1,0,3,10};
		int[] outA = Solution.sortedSquares(A);
		
		System.out.println("Output is : " + Arrays.toString(outA));
	}
	
	static class Solution {
	    public static int[] sortedSquares(int[] A) {
	    	int length = A.length;
	    	int[] arr = new int[length];
	    	for (int i = 0; i < length; i++) {
	    		arr[i] = (int)Math.pow(A[i],2);
	    	}
	    	Arrays.sort(arr);
	        return arr;
	    }
	}
}
