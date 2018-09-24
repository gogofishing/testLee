package testLee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Print2Smallest {
	 public static void main (String[] args)
	    {
	        int arr[] = {12, 13, 1, 10, 34, 1};
	        print2Smallest(arr);
	    }

	private static void print2Smallest(int[] arr) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		for(int x : arr) {
			set.add(x);
		}
		ArrayList myList = new ArrayList(set);
		Collections.sort(myList);
		System.out.println(myList.get(1));
	}
}
