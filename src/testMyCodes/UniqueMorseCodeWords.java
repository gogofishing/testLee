package testMyCodes;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Set<String> seen = new HashSet<>();
       
       StringBuilder sb = new StringBuilder();
       for (String word : words) {
           sb.delete(0, sb.length());
           for (char c : word.toCharArray()) {
               sb.append(code[c - 'a']);
           }
           
           if (!seen.contains(sb.toString())) {
               seen.add(sb.toString());
           }
       }
       return seen.size();
       
       
   }
}