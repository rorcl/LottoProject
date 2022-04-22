import java.util.Scanner;
public class LotteryGame{
	public static void main(String[] args){

		//declare vars
		int[] line1=new int[6];
		int[] line2=new int[6];
		int[] line3=new int[6];
		String flag="y";

		//declare obj
		Scanner scan;
		scan=new Scanner(System.in);
		LotteryGame lg;
		lg=new LotteryGame();

		//Ask player for their numbers
		System.out.println("Welcome to the Lottery Game");
		System.out.println("Enter 6 numbers between 1-40");
		System.out.println();

		while(flag.equalsIgnoreCase("y")){

		//inputs for LotteryGame
		
		for(int i=0;i<line1.length;i++){
			System.out.println("Enter number "+(i+1)+" for Line 1");
			line1[i]=scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<line2.length;i++){
			System.out.println("Enter number "+(i+1)+" for Line 2");
			line2[i]=scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<line3.length;i++){
			System.out.println("Enter number "+(i+1)+" for Line 3");
			line3[i]=scan.nextInt();
		}
		System.out.println();

		//output
		System.out.println();
		System.out.print("Line 1 = ");
			for(int i=0;i<line1.length;i++){
			System.out.print(line1[i]+"  ");
			}

		System.out.println();
		System.out.print("Line 2 = ");
			for(int i=0;i<line2.length;i++){
			System.out.print(line2[i]+"  ");
			}
		System.out.println();
		System.out.print("Line 3 = ");
		for(int i=0;i<line3.length;i++){
			System.out.print(line3[i]+"  ");
			}
			System.out.println();
			System.out.println();
			System.out.println("Do you want to play again?");
			flag=scan.next();
		}
		}
	}
