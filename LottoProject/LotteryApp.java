/*
Authors:Rory, Geneci, Kasia
Date:-2019
This application produce:
Input                   				Process             Output
6 random numbers from LotteryRandom		Run a loop			Six random secret lottery numbers
*/
//Import classes needed

import java.util.Scanner;
public class LotteryApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		int secretLotteryNumbers;
		int numbers[];

		//Create and initialize objects
		numbers = new int[6];
		LotteryRandom lr = new LotteryRandom();

		//Call method to process random
		lr.findSecretNumber();


		//Get values returned
		numbers = lr.getNumbers();

		//Output results
		for(int i=0; i<6; i++){
		System.out.println("The secret number :   " + (i+1) + " ==> "+numbers[i]);
		}
	}//end main method
}//end class App
