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
	public class LotteryRandom {
		// Declare variables
		private int secretLotteryNumbers;// holds value for each random secretNumbers
		private int[] secretNumbers;// to hold collection of secret secretNumbers
		int count = 0; // counter for while loop

		// Create the Constructor
		public LotteryRandom() {

			secretNumbers = new int[6];
			secretLotteryNumbers = 0;

		}

		// Create method to deal with secretNumber
		public void findSecretNumber() {
			// Used while loop to get to run six time and no increment is needed
			while (count < 6) {

				// Get a secretNumbers between [0 - 40] each time the while loop goes
				secretLotteryNumbers = (int) (Math.random() * 40);

				// Add 1 to the result to get a secretNumbers from the required range
				secretLotteryNumbers += 1;

				// This if is to make sure the counter is equal to 0 after random and will increase
				if (count == 0) {
					// The secretNumber is assigned to the array at that position and then
					// incremented by 1 position
					secretNumbers[count] = secretLotteryNumbers;
					count++;
				}
				// The else checks for secreteNumber not to repeat itself
				else {
					// Assign bollean to false
					Boolean match = false;
					/* This for loop is to run through the secretLotteryNumbers run and compare if
					 it is new or repeated secretNumbers*/
					for (int i = 0; i < count; i++) {
						// when secretNumber match secretNumbers it does not get to the list of 6
						if (secretLotteryNumbers == secretNumbers[i]) {
							match = true;
						}
					} // end of for
						/* If not match then it is assigned to secreteNumber and then assigned to final
						array as the winner secretNumbers*/
					if (!match) {

						secretNumbers[count] = secretLotteryNumbers;
						count++;
					}
				} // end of else

			} // end of while loop

		}// end of method findSecretNumber

		public int[] getNumbers() {
			return secretNumbers;
		}// end of get method

	}// end of class