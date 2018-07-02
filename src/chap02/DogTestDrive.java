package chap02;

class Dog{
	int size;
	int color;
	String name;
	
	void bark() {
		System.out.println("Ruff! Ruff!");
	};
}

public class DogTestDrive {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.size = 10;
		d.bark();
	}

}
