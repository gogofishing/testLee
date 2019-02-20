package testMyCodes;

import java.util.PriorityQueue;

public class k_closest_points_to_origin {
	class Solution {
	    public int[][] kClosest(int[][] points, int K) {
	        int[][] result = new int[K][2];
	        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
	        
	        for (int[] p : points)
	            pq.offer(p);
	        
	        for (int i=0; i<K; i++)
	            result[i] = pq.poll();
	        
	        return result;
	    }
	}
}
