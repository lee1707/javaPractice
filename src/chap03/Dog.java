package chap03;

public class Dog {
	String name;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name="Bart";
		
		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog();
		dogs[1] = new Dog();
		dogs[2] = dog1;
		
		System.out.println("������ ���� �̸�:"+dogs[2].name);
		
		dogs[0].name="Fred";
		dogs[1].name="Marge";
		
		int x = 0;
		while(x<3) {
			dogs[x].bark();
			x=x+1;
		}
	}
	
	void bark() {
		System.out.println(name+"�̰� �п��ϰ� ¢���ϴ�");
	}
	
	void eat() {
		
	}
	void chasecat() {
		
	}

}
