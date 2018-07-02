package chap02;

class Movie{
	String title;
	String genre;
	int rating;
	
	void playIt() {
		System.out.println("영화를 상영합니다.");
	}
}
public class MovieTestDrive {

	public static void main(String[] args) {
		Movie movieOne = new Movie();
		movieOne.title = "바람과 함께 아이스크림";
		movieOne.genre = "식도락";
		movieOne.rating = 10;
		
		Movie movieTwo = new Movie();
		movieTwo.title = "즐거운양치질";
		movieTwo.genre = "어린이";
		movieTwo.rating = 1;
		movieTwo.playIt();
		
		Movie movieThree = new Movie();
		movieThree.title = "비오는밤";
		movieThree.genre = "뮤지컬";
		movieThree.rating = 8;

	}

}
