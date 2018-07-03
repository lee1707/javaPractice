package chap04;

class Dog{
	int size;
	String name;
	
	void bark() {
		if(size>60) {
			System.out.println("Wooof! Wooof!");
		}
		else if(size>14) {
			System.out.println("Ruff! Ruff!");
		}else {
			System.out.println("Yip! Yip!");
		}
	}
}
public class DogTestDrive {

	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 6;
		Dog three = new Dog();
		three.size = 155;
		
		one.bark();
		two.bark();
		three.bark();
	}
}
