package testLee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        	int[] result = new int[2];
	    	Map<Integer, Integer> map = new HashMap<>();
	    	for(int i = 0; i < nums.length; i++) {
	    		map.put(nums[i], i);
	    	}
	    	
	    	for(int i = 0; i < nums.length; i++) {
	    		int compare = target - nums[i];
	    		if(map.containsKey(compare) && map.get(compare) != i) {
	    			result[0] = i;
	    			result[1] = map.get(compare);
	    		}
	    	}
	    	return result;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            int[] nums = stringToIntegerArray(line);
//            line = in.readLine();
//            int target = Integer.parseInt(line);
            int[] nums = {2,7,11,15};
			int target = 9;
			Solution s = new Solution();
			
            int[] ret = s.twoSum(nums, target);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
//    }
}