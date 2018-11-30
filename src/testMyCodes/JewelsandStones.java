package testMyCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JewelsandStones {
    public int numJewelsInStones(String J, String S) {
    	int hasJ = 0;
        List<Character> listS = new ArrayList<Character>();
        char[] charJ = J.toCharArray();
        char[] charS = S.toCharArray();
        for(char i : charS) {
        	listS.add(i);
        }
        for(char i : charJ) {
        	hasJ += Collections.frequency(listS, i);
        }
    	return hasJ;
    }
    public static void main(String[] args) {
		JewelsandStones s = new JewelsandStones();
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(s.numJewelsInStones(J, S));
	}
}