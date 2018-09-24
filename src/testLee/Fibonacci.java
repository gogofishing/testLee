package testLee;

import java.util.Scanner;

public class Fibonacci {

	public static int getF(int i) {
		if(i <= 2) {
			return 1;
		}
		int sum = 0;
		sum = getF(i - 1) + getF(i - 2);
		
		return sum;
	}
	
	public static int getFI(int j) {
		if(j != 1) {
			return j * getFI(--j);
		}
		else return 1; 
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			int i = sc.nextInt();
//			sc.nextLine();
//			System.out.println(getF(i));
//		}
		System.out.println(getF(3));
		System.out.println(getFI(3));
			
	}
}
