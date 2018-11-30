package testMyCodes;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int head = 0;
        int end = result.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
            result[head] = A[i];
                head++;
            }else{
                result[end] = A[i];
                end--;
            }
        }      
	
        return result;
    }
}
