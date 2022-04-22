/********************************************************************************************
Authors: Geneci, Rory, Kasia
Date:-2019
This application produce:
IPO
User is asked how many lines want to play.
User choose up to three lines.
Each lines has 6 numbers
The app generates 6 random numbers.
Then compares with user numbers.
The app output result of numbers of lines played and how many matches occured in that game.
The app ask user if user wish to play another game.
if user says "y" the app restart from the user choice of lines.
If user says "N" the app finishes
*********************************************************************************************/

	public class LotteryGame {

		// Declare variables
		private int[][] lines;
		private int numbersPicked;
		//private int history;
		private int[] counter; // to hold values for all rows lines
		private int userChoice;


		// Instantiate constructor
		public LotteryGame() {
			//numbers direct from user
			lines = new int[userChoice][6];
			//history=0;
			counter=new int [3]; //The secrete number counter array

		}

		// Set
		public void setLines(int[][] lines) {
			this.lines = lines;
		}

		public void setUserChoice(int userChoice) {
				this.userChoice = userChoice;
		}

		// Compute
		/*
		 Receiving the random numbers from LotteryApp after being generated on the LotteryRandom class
		 the secretNumber array is passed as paramenters
		*/
		public void computeNumbersPicked(int[] secretNumbers) {

			//Results for random secretNumbers
			System.out.print("Secret Numbers: ");
			//Loop for secret number
			for(int i=0; i<6; i++){
				System.out.print(secretNumbers[i] + " ");
			}
			System.out.println();
			//Test for user number and secret numbers to match
			boolean match = false;

			for (int i = 0; i < lines.length; i++) {

				for (int j = 0; j < lines[i].length; j++) {

					match = false;

					for(int k = 0; k < 6; k++)
					{
						if ( secretNumbers[k]==lines[i][j])
						{
							match = true;
						}

					}
					if (match) {
						counter[i]++;
					}
					userChoice++;

				}

				System.out.println("On line "+(i+1)+" you guessed: "+counter[i] +" You win:  "+ getWinnings(counter[i]));

			}

			System.out.println("You played:  " +(userChoice /6)+ " lines in total");

		}


		//public void computeHistory(){
			//for(int i=0;i<lines.length;i++){
				//for(int j=0;j<lines[i].length;j++){
					//if(lines[i]==lines[j]){
					//counter++;
				//}
				//}
			//}
		//}

		// Get
		// Create a method with string type to return the message about prize
		public String getWinnings(int match){

			if(match == 3){

				return "Prize 125.00";

				}
				else if (match == 4){

				return "Prize 300.00";

				}
				else if(match == 5){

				return "Prize 1500.00";

				}
				else if(match == 6){

				return "Won the Lottery 150,000,000";

				}
				else {

					return "Nothing";
				}

		}

		public int getUserChoice(){

			return userChoice;

		}



		//public int getHistory(){
			//return history;
		//}
	}