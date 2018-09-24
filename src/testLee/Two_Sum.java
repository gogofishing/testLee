package testLee;


import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	    public int[] twoSum_1(int[] nums, int target) {
	    	int[] result = new int[2];
	        for(int i = 0; i < nums.length - 1; i++) {
	            for(int j = i + 1; j < nums.length; j ++){
	                if(nums[i] + nums[j] == target){
	                	result[0] = i;
	                	result[1] = j;
	                }
	            }
	        }
//			throw new IllegalArgumentException("No two sum solution");
	        return result;
	        
	    }
	    public int[] twoSum_2(int[] nums, int target) {
	    
	    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	for(int i = 0; i < nums.length; i++) {
	    		map.put(nums[i], i);
	    	}
	    	
	    	for(int i = 0; i < nums.length; i++) {
	    		int compare = target - nums[i];
	    		if(map.containsKey(compare) && map.get(compare) != i) {
	    			return new int[] {i, map.get(compare)};
	    		}
	    	}
	    	return null;
	    }
	    
	    public static void main(String[] args) {
			Two_Sum a = new Two_Sum();
	    	int[] nums_1 = {2,7,11,15};
			int target = 9;
			int[] result = a.twoSum_2(nums_1, target);
			for(int i : result) {
				System.out.println(i);
			}
		}
}
