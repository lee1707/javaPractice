package chap02;

class TapeDeck{
	boolean canRecord = false;
	
	void playTape() {
		System.out.println("tape playing");
	}
	void recordTape() {
		System.out.println("tape recording");
	}
}
class TapeDeckTestDrive {

	public static void main(String[] args) {
		TapeDeck td = new TapeDeck();
		
		td.canRecord = true;
		td.playTape();
		
		if(td.canRecord==true) {
			td.recordTape();
		}

	}

}
