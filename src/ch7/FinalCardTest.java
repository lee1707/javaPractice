package ch7;


class Carde{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Carde(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Carde(){
		this("HEART",1);
	}
	public String toString() {
		return KIND+" "+NUMBER;
	}
}
public class FinalCardTest {
	public static void main(String[] args) {
		Carde c = new Carde("HEART", 10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
