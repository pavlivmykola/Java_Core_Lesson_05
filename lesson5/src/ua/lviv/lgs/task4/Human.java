package ua.lviv.lgs.task4;

public class Human {
	private String name;
	private int age;
	private int height;
	
	Human(){
		name="Іван";
		age=23;
		height=180;
	}
	
	Human(String name){
		this();
		this.name=name;
	}
	Human(int age, int height){
		this();
		this.age=age;
		this.height=height;
	}

}
