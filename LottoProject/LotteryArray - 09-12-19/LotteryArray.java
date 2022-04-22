public class LotteryArray{

	//declare variables
	private int[][] lines;
	private int numsChosen;
	private int randomNums;
	//private int[] counter;

	//instantiate
	public LotteryArray(){
		lines=new int[2][6];
	}

	//set
	public void setLines(int[][] lines){
		this.lines=lines;
	}
	/*public void setRandomNums(int randomNums){
		this.randomNums=randomNums;
	}*/

	//compute
	public void computeNumsChosen(){
		System.out.println();
		System.out.print("Random Numbers = ");
		for(int n=0;n<6;n++){
			randomNums=(int)(Math.random()*40)+1;
			System.out.print(randomNums+" ");
		for(int i=0;i<lines.length;i++){
			for(int j=0;j<lines[i].length;j++){
			numsChosen=numsChosen+lines[i][j];
		}
	}
}
}

	//get
	public int getNumsChosen(){
		return numsChosen;
	}
}
