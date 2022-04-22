/*
Authors: Kasia,Geneci, Rory
Date:-2019
This application produce:
Input                   			Process                 					Output
numbers played by user[3][6]		Store user numbers in 					Compare numbers with
									arrays up to three						secreteNumbers
*/
import java.util.Scanner;

public class LotteryGameALL{
	public static void main(String[] args) {
		// Declare variables
		int numbersOfPlay;// counter for values of numbers of lines
		int numbersPlayed;// counter hold values of numbers entered
		int[][] userNumbers;// holds value for each numbers entered by users
		String flag="y";
		// Declare objects
		Scanner input = new Scanner(System.in);
		userNumbers = new int[2][6];


		while(flag.equalsIgnoreCase("y")){
		// Prompt user
		System.out.println(" Enter 6 numbers to make one line of this lottery");

		//Loop for three lines
		for (numbersOfPlay = 0; numbersOfPlay < userNumbers.length; numbersOfPlay++) {

			//Inform users line they are playing
			System.out.println("Please play line : " + (numbersOfPlay + 1));

			//Loop for six numbers
			for (numbersPlayed = 0; numbersPlayed < userNumbers[numbersOfPlay].length; numbersPlayed++) {

				userNumbers[numbersOfPlay][numbersPlayed] = input.nextInt();

				//Assurance of numbers ranges
				if (userNumbers[numbersOfPlay][numbersPlayed] > 40) {
					System.out.println("Error, please enter number between 1-40");
					numbersPlayed--;
				}//end of if statement in case number entered greater than 40

			}// end of for loop for six numbers entered by a player

			//System.out.println("You have just played line number : " + (numbersOfPlay + 1));

		}//end of for loop to get numbers entered by a player
		System.out.println("Do you want to play again?");
      	flag=input.next();
	}//end while
		//Create nested loop to print numbers played by a player
		for (numbersOfPlay = 0; numbersOfPlay < 2; numbersOfPlay++) {

			System.out.println("Line Number : " + (numbersOfPlay + 1));

			for (numbersPlayed = 0; numbersPlayed < 6; numbersPlayed++) {

				System.out.println("Your numbers entered: " + userNumbers[numbersOfPlay][numbersPlayed]);

			}// end of for loop to print stored numbers played
			System.out.println();
		}//end of for loop to print numbers of plays(up to three)
	}//end of main method
}//end of class LotterryGame
