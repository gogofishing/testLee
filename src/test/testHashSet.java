package test;

import java.util.HashSet;
import java.util.Set;

public class testHashSet {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<Integer>();
		if (mySet.contains(1)) {
			System.err.println();
		}
		
	}
	boolean containsSmiley(String s) {
	    
		{
		if (s == null) {
	        return false;
	    }
	    else {
	        return s.contains(":)");
	    }
		}
		
	}
	
    public int repeatedNTimes(int[] A) {
    	int flag = 0;
        Set<Integer> mySet = new HashSet<Integer>();
        for (int i : A) {
            if(!mySet.contains(i)) {
                mySet.add(i);
            }
            else {
                 flag = i;
            }
        }
        
        return flag;
    }

}

