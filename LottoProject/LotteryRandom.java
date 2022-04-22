/*
Authors: Geneci, Kasia, Rory
Date:-2019
This application produce:
Input                   	Process                 			Output
							secret random number[6](1 -40)		6 random numbers
*/
public class LotteryRandom{
	//Declare variables
	private int secretLotteryNumbers = 0;//holds value for each random numbers
	private int[] numbers;//to hold collection of secret numbers
	int count =0; // counter for while loop and if statement
	int mached;// counter for repeated numbers

	//Create the Constructor
	public LotteryRandom(){
		//Initiate variables
		numbers = new int[6];
	}

	//Create method to deal with secretNumber
	public void findSecretNumber(){
	//Used while loop to get to run six time and no increment is needed
		while( count < 6){

			// Get a numbers between [0 - 40] each time the while loop goes
			secretLotteryNumbers = (int)(Math.random()*40);


			// Add 1 to the result to get a numbers from the required range interacting with loop
			secretLotteryNumbers += 1;

			//This if is to make sure the counter is equal to 0
			if (count==0){
			//The secretNumber is assigned to the array at that position and then incremented by 1 position
				numbers[count] = secretLotteryNumbers;
				count++;
			}
			//The else checks for secreteNumber not to repeat itself
			else{
				//Assign bollean to false
				Boolean match = false;
				//This for loop is to run through the secretLotteryNumbers run and compare if it is new or repeated numbers
				for(mached = 0; mached < count; mached++){
					//when secretNumber match numbers it does not get to the list of 6
					if (secretLotteryNumbers == numbers[mached]){
						match = true;
					}
				}//end of for
				//If not match then it is assigned to secreteNumber and then assigned to final array as the winner numbers
				if (!match){

					numbers[count] = secretLotteryNumbers;
					count++;
				}
			}//end of else

	      }//end of while loop

	  }//end of method findSecretNumber

	  public int[] getNumbers(){
		  return numbers;
	  }//end of get method

}// end of class
