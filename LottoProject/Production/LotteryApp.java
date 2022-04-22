/*
Authors:Rory, Geneci, Kasia
Date:-2019
This application produce:
Input                               Process             Output
6 random secreteNumbers from LotteryRandom       Run a loop       Six random secret lottery secreteNumbers
*/

//Import classes needed
import java.util.Scanner;
public class LotteryApp{
   //Declare main method
   public static void main (String args[]){
      //Declare variables
      //int secretLotteryNumbers; //to be used in class to compare winners
      int secreteNumbers[]; //array to hold random numbers
      int numbersOfPlay;// to hold values of of lines
      int numbersPlayed;// to hold values of users numbers entered
      int userNumbers[][]; // to hold values for both lines and user numbers played
      String flag="y"; // to hold value answered by user regarding playing again

      //Create and initialize objects
      secreteNumbers = new int[6];//holds values for random
      LotteryRandom lr = new LotteryRandom();
      userNumbers = new int[2][6];//holds value from user scan
      Scanner scan = new Scanner(System.in); // to get values entered by users

	  //Call method to process random
      lr.findSecretNumber();
	  // Run the while loop to make sure users play many time as they want
      while(flag.equalsIgnoreCase("y")){


      //Loop for three lines
      for (numbersOfPlay = 0; numbersOfPlay < 2; numbersOfPlay++) {

         //Inform users line they are playing
         System.out.println("Please play line : " + (numbersOfPlay + 1));

            //Loop for six secreteNumbers
            for (numbersPlayed = 0; numbersPlayed < 6; numbersPlayed++) {

               int nextNumber = scan.nextInt();

               //Assurance of secreteNumbers ranges
               if (nextNumber > 40) {
                  System.out.println("Error, please enter number between 1-40");
                  numbersPlayed--;

               }//end of if statement in case number entered greater than 40

               /*check if repeated number. if number already entered system
               will take the number away from queue and alow user to continue play*/
               Boolean match = false;
               for(int j = 0; j < numbersPlayed; j++)
               {
                  if (nextNumber == userNumbers[numbersOfPlay][j])
                  {
                     match = true;
                  }
               }
               if (!match){
                  userNumbers[numbersOfPlay][numbersPlayed] = nextNumber;
               }else{
                  System.out.println("this number: "+nextNumber+ " already entered");
                  numbersPlayed--;
               }

            }// end of for loop for six secreteNumbers entered by a player

         }//end of for loop to get secreteNumbers entered by a player


      System.out.println("Do you want to play again?");
      flag=scan.next();


      //Create nested loop to print secreteNumbers played by a player
	        for (numbersOfPlay = 0; numbersOfPlay < 2; numbersOfPlay++) {

	           System.out.println("Line Number : " + (numbersOfPlay + 1));

	              for (numbersPlayed = 0; numbersPlayed < 6; numbersPlayed++) {

	                 System.out.println("Your secreteNumbers entered: " + userNumbers[numbersOfPlay][numbersPlayed]);

	              }// end of for loop to print stored secreteNumbers played
      }//end of for loop to print secreteNumbers of plays(up to three)

      }//end while
      scan.close();
      secreteNumbers = lr.getNumbers();
      //Output results for random secreteNumbers
      for(int i=0; i<6; i++){
      System.out.println("The secret number :   " + (i+1) + " ==> "+secreteNumbers[i]);
      }

      //Output results for user secreteNumbers
      //Summary goes here

   }//end main method
}//end class App
