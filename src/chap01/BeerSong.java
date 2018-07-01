package chap01;

public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while(beerNum>0) {
			if(beerNum==1) {
				word = "bottle";
			}
			
			System.out.print(beerNum+" "+word+" of beer on the wall, ");
			System.out.println(beerNum+" "+word+" of beer.");
			System.out.print("Take one down and pass it around, ");
			beerNum = beerNum-1;
			
			if(beerNum>0) {
				System.out.println(beerNum+" "+word+" of beer on the wall.");
				System.out.println();
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
		}
		String beerNum2 = "No more";
		word = "bottles";
		System.out.println();
		System.out.print(beerNum2+" "+word+" of beer on the wall, ");
		System.out.println(beerNum2+" "+word+" of beer.");
		System.out.print("Go to the store and buy some more, ");
		System.out.println("99 bottles of beer on the wall,");
	}

}
