package chap05;

public class SimpleDotCom {

	int locationCells[];
	int numOfHits = 0;

	public String checkYourself(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		String result = "miss";

		for(int i=0; i<locationCells.length; i++) {
			if(guess==locationCells[i]) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

	public void setLocationCells(int[] cellLocations) {
		locationCells = cellLocations;
	}

}
