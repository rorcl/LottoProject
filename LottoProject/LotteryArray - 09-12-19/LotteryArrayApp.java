import java.util.Random;
import java.util.Scanner;
public class LotteryArrayApp{
	public static void main(String[] args){

		//declare variables
		int[][] lines;
		int numsChosen;
		String flag="y";
		int randomNums;
		//int counter[];

		//declare objects
		LotteryArray la;
		la=new LotteryArray();
		Scanner scan;
		scan=new Scanner(System.in);
		Random rn=new Random();

		//initalise array/variables
		lines=new int[2][6];
		randomNums=6;

		//inputs
		while(flag.equalsIgnoreCase("y")){
			for(int i=0;i<lines.length;i++){
				System.out.println("Line "+(i+1));
				for(int j=0;j<lines[i].length;j++){
					lines[i][j]=scan.nextInt();
					}
					System.out.println();
				}

		//set
		la.setLines(lines);
		//la.setRandomNums(randomNums);

		//compute
		la.computeNumsChosen();

		//get
		numsChosen=la.getNumsChosen();

		//output
		System.out.println();
		for(int i=0;i<lines.length;i++){
			System.out.print("Line "+(i+1)+" = ");
			for(int j=0;j<lines[i].length;j++){
				System.out.print(lines[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("Do you want to play again?");
		flag=scan.next();
	}
}
}
