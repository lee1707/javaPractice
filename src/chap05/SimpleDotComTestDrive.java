package chap05;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		//String numberOfHits = 0;
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		if(result.equals("hit")) {
			testResult = "passed";
			//numberOfHits= numberOfHits+1;
			//if numberOfHits==3 ->"kill";
		}
		System.out.println(testResult);

	}

}
