package testMyCodes;

import java.util.TreeMap;

public class RecentCounter {
    TreeMap<Integer, Integer> tm;
    public RecentCounter() {
        tm = new TreeMap<>();
    }
    
    public int ping(int t) {
         tm.put(t, 1 + tm.size());
        return tm.tailMap(t - 3000).size();
    }
}