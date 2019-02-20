package testMyCodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SortArrayByParityII {

	public static void main(String[] args) {
		int[] A = {4,2,5,7};
		int[] outA = Solution.sortArrayByParityII(A);
		System.out.println("Output is £º " + Arrays.toString(outA));
	}
	
	public static class Solution {
	    public static int[] sortArrayByParityII(int[] A) {
	        int length = A.length;
	        Queue qEven = new LinkedList();
	        Queue qOdd = new LinkedList();
	        for (int x : A) {
	        	if ( x % 2 == 0) {
	        		qEven.add(x);
	        	}
	        	else {
	        		qOdd.add(x);
	        	}
	        }
	        int[] arr = new int[length];
	        for (int i = 1; i <=length; i++) {
	        	if (i % 2 == 0) {
	        		arr[i - 1] = (int) qOdd.poll();
	        	}
	        	else {
	        		arr[i - 1] = (int) qEven.poll();
	        	}
	        }
	        return arr;
	    }
	}
}
