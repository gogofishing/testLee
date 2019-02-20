package testMyCodes;

public class RobotReturntoOrigin {
    static boolean judgeCircle(String moves) {
        boolean flag = false;
        
        int length = moves.length();
        int stageLR = 0;
        int stageUD = 0;
        for (int i = 0; i < length; i++) {
        	char x = moves.charAt(i);
        	if (x == 'L') {
        		stageLR++;
        	}
        	if (x == 'R') {
        		stageLR--;
        	}
        	if (x == 'U') {
        		stageUD++;
        	}
        	if (x == 'D') {
        		stageUD--;
        	}
        }
        
        if (stageUD ==0 && stageLR == 0) {
        	flag = true;
        }
        
        return flag;
//        return moves.replace("L", "").length() == moves.replace("R", "").length()
//                && moves.replace("U", "").length() == moves.replace("D", "").length();
    }
    
    public static void main(String[] args) {
		System.out.println(judgeCircle("LDRRLRUULR"));
	}

}
