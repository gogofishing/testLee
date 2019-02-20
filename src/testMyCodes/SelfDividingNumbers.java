package testMyCodes;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {
		SelfDividingNumbers s = new SelfDividingNumbers();
		List<Integer> r = s.selfDividingNumbers(1, 22);
		for (Integer x : r) {
			System.out.println(x);
		}
		char c = '9';
		System.out.println(c - '0');
	}
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
        	String number = String.valueOf(i);
        	int length = number.length();
        	boolean isDividing = true;
        	for (int j = 0; j < length; j++) {
        		int flag = number.charAt(j) - '0';
        		if (flag == 0) {
        			isDividing = false;
        			continue;
        		}
        		else if(i % flag != 0) {
        			isDividing = false;
        		}
        	}
        	
        	if (isDividing) {
        		results.add(i);
        	}
        	
        }
		return results;
    }
}