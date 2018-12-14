package ua.lviv.lgs.task5;

public class Main {
	public static void main(String[] args) {
		Amphibia am = new Frog();
		Frog frog = (Frog) am;
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();
	}

}
