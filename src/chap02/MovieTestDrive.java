package chap02;

class Movie{
	String title;
	String genre;
	int rating;
	
	void playIt() {
		System.out.println("��ȭ�� ���մϴ�.");
	}
}
public class MovieTestDrive {

	public static void main(String[] args) {
		Movie movieOne = new Movie();
		movieOne.title = "�ٶ��� �Բ� ���̽�ũ��";
		movieOne.genre = "�ĵ���";
		movieOne.rating = 10;
		
		Movie movieTwo = new Movie();
		movieTwo.title = "��ſ��ġ��";
		movieTwo.genre = "���";
		movieTwo.rating = 1;
		movieTwo.playIt();
		
		Movie movieThree = new Movie();
		movieThree.title = "����¹�";
		movieThree.genre = "������";
		movieThree.rating = 8;

	}

}
