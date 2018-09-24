package testLee;

public class Hanoi {
	static int m = 1;
	 public static void printStep(int disks,char from,char to)
	    {
	        System.out.println("��" + (m++) +" ���ƶ� : " +" �� "+ disks+" ��Բ�̴� " + from +" ->�Ƶ�->  " + to);
	    }
	
	public static void moveHanoi(int num, char from, char mid, char to) {
		if(num == 1) {
			printStep(1, from, to);
		}
		else {
			moveHanoi((num - 1), from, to, mid);
			printStep(num, from, to);
			moveHanoi((num - 1), mid, from, to);
		}
	}
	
	public static void main(String[] args) {
		char from = 'A';
		char mid = 'B';
		char to = 'C';
		int num = 3;
		moveHanoi(num, from, mid, to);
	}
}
