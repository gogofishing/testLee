package testLee;

import java.util.Scanner;

public class ToLowerCase {
	
    public String toLowerCase(String str) {
        String toLow = str.toLowerCase();
        return toLow;
    }

    public static void main(String[] args) {
    	ToLowerCase tl = new ToLowerCase();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(tl.toLowerCase(input));
	}
}
