//package ch7;
//
//class Product{
//	int price;
//	int bonusPoint;
//	
//	Product(int price){
//		this.price = price;
//		this.bonusPoint = (int)(price/10.0);
//	}
//}
//
//class Tv2 extends Product{
//	Tv2(){
//		super(100);
//	}
//	public String toString() {return "Tv";}
//}
//
//class Computer extends Product{
//	Computer(){
//		super(200);
//	}
//	public String toString() {return "computer";}
//}
//
//class Audio extends Product{
//	Audio(){super(50);}
//	public String toString() {return "Audio";}
//}
//
//class Buyer{
//	int money = 1000;
//	int bonusPoint = 0;
//	Product[] item = new Product[10];
//	int i=0;
//	
//	void buy(Product p) {
//		if(money<p.price) {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;
//		}
//		money -=p.price;
//		bonusPoint += p.bonusPoint;
//		item[i++] = p;
//		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
//	}
//	
//	void summary() {
//		int sum = 0;
//		String itemList = "";
//		
//		for(int i=0; i<item.length; i++) {
//			if(item[i]==null) break;
//			sum += item[i].price;
//			itemList += (i==0) ? ""+item[i] : ","+item[i];
//		}
//		System.out.println("������ ��ǰ�� �� �ݾ��� "+sum+"�����Դϴ�."); 
//		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
//	}
//}
//
//class PolyArgumentTest2 {
//
//	public static void main(String[] args) {
//		Buyer b = new Buyer();
//		
//		b.buy(new Tv2());
//		b.buy(new Computer());
//		b.buy(new Audio());
//		b.summary();
//	}
//
//}
