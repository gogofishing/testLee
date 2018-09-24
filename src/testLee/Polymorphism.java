package testLee;

public class Polymorphism {
	public static void main(String[] args) {
		Animal am = new Cat();
		System.out.println(am.num);
		System.out.println(am.age);
		am.eat();
		am.sleep();
		am.run();
		
		
	}
}

class Animal {
	int num = 10;
	static int age = 20;
	public void eat() {
		System.out.println("eat");
	}
	
	public static void sleep() {
		System.out.println("sleep");
	}
	
	public void run() {
		System.out.println("run");
	}
}

class Cat extends Animal {
	int num = 100;
	static int age = 200;
	public void eat() {
		System.out.println("cat eat");
	}
	
	public static void sleep() {
		System.out.println("cat sleep");
	}
	
	public void catMouse() {
		System.out.println("cat Mouse");
	}
}