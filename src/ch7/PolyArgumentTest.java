package ch7;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product{
	Tv2(){
		super(100);
	}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {return "computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
}

class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� "+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ "+b.bonusPoint+"���Դϴ�.");
	}

}
