package testMyCodes;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        
        for(int x : A) {
            sumA += x;
        }
        for(int x : B) {
            sumB += x;
        }
        int diffAB = (sumA - sumB) / 2;
        List<Integer> list = new ArrayList<Integer>();
        for(int x :A) list.add(x);
        for(int x : B) {
            if(list.contains(x + diffAB))
                return new int[] {x, x + diffAB};
        }
        
        return null;
        
    }
}