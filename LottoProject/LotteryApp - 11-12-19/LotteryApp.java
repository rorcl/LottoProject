//Import classes needed for the app to run
import java.util.Random;
import java.util.Scanner;

public class LotteryApp {
	public static void main(String[] args) {

		// declare variables
		int[][] lines;
		int numbersPicked;
		int secreteNumbers[]; // array to hold random numbers
		String flag = "y";
		//int userChoice;
		int intNumMatches =0;
		// int secretNums;
		// int counter[];
		//int history;
		int counter;

		// declare objects
		LotteryGame lg;
		lg = new LotteryGame();
		Scanner scan;
		scan = new Scanner(System.in);
		secreteNumbers = new int[6];// holds values for random
		LotteryRandom lr = new LotteryRandom();

		// Call method to process random
		lr.findSecretNumber();

		// initalise array
		lines = new int[2][6];
		// numbers=new int[40];
		// inputs
		//userChoice=0;
		counter=0;

		System.out.println("Welcome to GRK Lottery!\n");

		//Prompt user to know how many time want to play
		/*do{
			System.out.println("Choose how many games");
			userChoice=scan.nextInt();
		}while(userChoice.length!=3){
			break;
			}*/

		while (flag.equalsIgnoreCase("y")){

			//int count =0;
			for (int i = 0; i < lines.length; i++) {
				System.out.println("Line " + (i + 1));
				for (int j = 0; j < lines[i].length; j++) {
					lines[i][j] = scan.nextInt();
			
				//Assurance of user numbers ranges 1-40
				if(lines[i][j] > 40 || lines[i][j] < 1) {
					System.out.println("Error, please enter number between 1-40");
					j--;
				}//end of if statement in case number entered greater than 40
			}//end of loop for columns
		}//end of loop for rows
			System.out.println();
			for(int i=0;i<lines.length;i++){
				for(int j=0;j<lines[i].length;j++){
					if(lines[i]==lines[j]){
						counter++;
						lines[i][j]=scan.nextInt();
					}
				}
			}


			// set
			lg.setLines(lines);

			// compute
			lg.computeNumbersPicked();
			//lg.computeHistory();

			// get
			numbersPicked = lg.getNumbersPicked();
			secreteNumbers = lr.getNumbers();
			//history=lg.getHistory();

			// output
			//Output results for random secreteNumbers
			System.out.print("Secret Numbers: ");
			for(int i=0; i<6; i++){
				System.out.print(secreteNumbers[i] + " ");
				}

			//int count1 = 0;
			System.out.println();
			for (int i = 0; i < lines.length; i++) {
				System.out.print("Line " + (i + 1) + " = ");
				for (int j = 0; j < lines[i].length; j++) {
					System.out.print(lines[i][j] + " ");
				//count1++;
				}
				System.out.println();
			}

			for(int i=0;i<lines.length;i++){
				for(int j=0;j<lines[i].length;j++){
					System.out.println("You played "+lines[i][j]);
				}
			}


			System.out.println("\n");
			System.out.println("Do you want to play again?");

			flag = scan.next();

		}//end while loop
		//scan.close();

			//Output results for random secreteNumbers
			/*System.out.println("The secret number are:");
			for(int i=0; i<6; i++){

				System.out.print(secreteNumbers[i] + " ");
			}
			System.out.println();*/

	}// end of main method
} // end of LotteryApp class
