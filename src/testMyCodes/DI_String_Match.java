package testMyCodes;

class Solution {
    public int[] diStringMatch(String S) {
        int length = S.length();
        int countD = length;
        int countI = 0;
        int[] A = new int[length + 1];
        for (int i = 0; i < length; i++) {
        	if (S.charAt(i) == 'I') {
        		A[i] = countI;
        		countI++;
        	}
        	else {
        		A[i] = countD;
        		countD--;
        	}
        }
        A[length] = countI;
        return A;
        
    }
}