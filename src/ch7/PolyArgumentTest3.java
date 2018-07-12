package ch7;

import java.util.Vector;

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

class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? ""+p : ","+p;
		}
		System.out.println("������ ��ǰ�� �� �ݾ��� "+sum+"�����Դϴ�."); 
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�");
		}else {
			System.out.println("�����Ͻ� ��ǰ�� �ش� ��ǰ�� �����ϴ�");
		}
	}
}

class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv2 tv = new Tv2();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
