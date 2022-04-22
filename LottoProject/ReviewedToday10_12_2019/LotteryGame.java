public class LotteryGame {

	// declare variables
	private int[][] lines;
	private int numbersPicked;
	//private int userChoice;
	//private int secretNums;
	//private int[] counter;

	// instantiate
	public LotteryGame() {
		lines = new int[2][6];
		// numbers=new int[40];
		//userChoice = 0;
	}

	// set
	public void setLines(int[][] lines) {
		this.lines = lines;
	}



	// compute
	public void computeNumbersPicked() {
		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length; j++) {
				//if(lines[i][j]==secreteNumbers[j]){
					//matched++;

				numbersPicked = numbersPicked + lines[i][j];
			}


		}
	}

	// get
	public int getNumbersPicked() {
		return numbersPicked;
	}
}
