package selenium;

abstract class Animal {
	String name;
	int age;
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	public abstract void makeSound();
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		
		
	}
	/*public void addAnimal() {
		// TODO Auto-generated method stub
		
	}*/
	

	

	}
class Lion extends Animal{

	Lion(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void makeSound() {
		System.out.println("Roar");
	}
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	
	
}
}	

class Elephant extends Animal{

	Elephant(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void makeSound() {
		System.out.println("squeaks");
	}
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	
	
}
}

class Tiger extends Animal{

	Tiger(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void makeSound() {
		System.out.println("Roar");
	}
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}	
	
}

