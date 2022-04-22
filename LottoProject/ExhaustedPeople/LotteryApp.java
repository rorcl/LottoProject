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

	//Import classes needed for the app to run
	import java.util.Random;
	import java.util.Scanner;

	public class LotteryApp {
		public static void main(String[] args) {

			// Declare variables
			int[][] lines;
			int secretNumbers[]; // array to hold random numbers
			String flag = "y";
			//int history;
			int userChoice;// to hold user numbers of line to play
			int nextNumber=0; // local variables to hold user unput for lottery

			// Declare objects
			LotteryGame lg;
			lg = new LotteryGame();
			Scanner scan;
			scan = new Scanner(System.in);
			secretNumbers = new int[6];// holds values for random
			LotteryRandom lr = new LotteryRandom();

			//Start app
			System.out.println("Welcome to GRK Lottery!\n");

			while (flag.equalsIgnoreCase("y")){

				System.out.println("How many lines you want to play?");

					// To set the numbers of line users wants to play
					userChoice = scan.nextInt();

						if(userChoice == 1){
							 userChoice= 1;
						}else if(userChoice == 2){
							userChoice = 2;
						}else if(userChoice == 3){
							userChoice = 3;
						}else{
							System.out.println("Wrong choice. Please choose between 1 and 3!");
							System.exit(0);
						}//end of if statement

			// initalise array
			lines = new int[userChoice][6]; // the number of rows is determined by user choice

			Boolean match = false; // to be used with test for repeatitive

			// Call method to process random
			lr.findSecretNumber();

			//Inform user range acceceptable to play.
			System.out.println("Play numbers between 1-40:");
				for (int i = 0; i < lines.length; i++) {

					System.out.println("Please play Line " + (i + 1));
					for (int j = 0; j < lines[i].length; j++) {

						nextNumber  = scan.nextInt();
						userChoice++;

						userChoice = userChoice + userChoice;

						//Assurance of user numbers ranges 1-40
						if(nextNumber > 40 || nextNumber < 1) {
							System.out.println("Error, please enter number between 1-40");
							j--;
						}//End of if statement in case number entered greater than 40

						//Test for repeative numbers and do not accept it
						match = false;
						for(int k = 0; k < 6; k++)
						{
							if (nextNumber == lines[i][k])
							{
								match = true;
							}
						}
						if (!match){
							lines[i][j] = nextNumber;
						}else{
							System.out.println("this number: "+nextNumber+ " already entered");
							j--;
						}

					}

				}//end of loop for rows
				System.out.println();

				// set
				lg.setLines(lines);

				// get
				secretNumbers = lr.getNumbers();
				userChoice = lg.getUserChoice();
				//history=lg.getHistory();

				// compute
				lg.computeNumbersPicked(secretNumbers);
				//lg.computeHistory();

				//Print out numberss played by users
				System.out.println();

				for (int i = 0; i < lines.length; i++) {
					System.out.print("You played Line " + (i + 1) + " = ");
						for (int j = 0; j < lines[i].length; j++) {
							System.out.print(lines[i][j] + " ");

					}

					System.out.println();
				}

				System.out.println("\n");
				System.out.print("Do you want to play again? (y or n)");

				// This state if user wants to play another game
				flag = scan.next();
				}//end while loop
				scan.close();// close entry for user

		}// end of main method
	} // end of LotteryApp class