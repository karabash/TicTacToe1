import java.util.Scanner;


public class User{
	CheckWinner checkX = new CheckWinner();
	CheckWinner checkO = new CheckWinner();
	Scanner input = new Scanner(System.in);
	CheckWinner	winner = new CheckWinner();
	Table t1 = new Table();

	static protected char x = 'X';
	static protected char o = 'O';
	private String user1;
	private String user2;
	private int counter = 9;
	int yesOrNo;




	int choosenNumber;

	public void userInputName(){
		System.out.println("User 1 enter your name");
		user1 = input.nextLine();
		setUser1(user1);
		user1.trim();
		System.out.println("User 2 enter your name");
		user2 = input.nextLine();
		setUser2(user2);
		user1.trim();


	}

	public void turnAndPlay(){
		int userChoosedNum;
		t1.table();
		boolean isThereAnyWinner = true;
		boolean contuine = true;
		while(counter>0 && isThereAnyWinner && contuine)
		{
			if(counter%2==1){

				userChoosedNum = chooseANnumberUser1();
				checkUserInputBt0and(userChoosedNum);
				checkIsItEmpty(userChoosedNum, x);
				isThereAnyWinner =checkX.checkWinnerRow(x);

			}


			else{
				userChoosedNum = chooseANnumberUser2();
				checkUserInputBt0and(userChoosedNum);
				checkIsItEmpty(userChoosedNum, o);
				isThereAnyWinner =checkO.checkWinnerRow(o);


			}

			t1.printOut();
			printOutWinner(isThereAnyWinner, counter);

			counter--;

			if(counter==0 && isThereAnyWinner== true){
				System.out.println("\t *** THERE IS NO WINNER ***\n");
			}

			if(isThereAnyWinner == false || counter == 0){
				System.out.println("\t    DO you wanna play again?\n1)Yes\n2)No");

				yesOrNo = input.nextInt();
				while(!(yesOrNo >= 0 && yesOrNo <= 2) ){
					System.out.println("\t    Obs you've to choose between 0 and 1\n");
					System.out.println("\t    DO you wanna play again?\n1)Yes\n2)No\n");

					yesOrNo = input.nextInt();			
				}
				if(yesOrNo==1){
					t1.table();
					contuine = true;
					isThereAnyWinner = true;
					setCounter(9);			
				}
				else{
					System.out.println("By");
					isThereAnyWinner = false;
				}

			}
		}
	}

	public int chooseANnumberUser1(){
		System.out.println("Choose a number "+ getUser1());
		choosenNumber = input.nextInt();
		return choosenNumber;
	}

	public int chooseANnumberUser2(){
		System.out.println("Choose a number "+ getUser2());
		choosenNumber = input.nextInt();
		return choosenNumber;

	}	

	public void checkUserInputBt0and(int userChoosedNum){
		while(!(userChoosedNum >= 0 && userChoosedNum <= 8 ) ){
			System.out.println("\t  Obs you've to choose between 0 and 8");
			userChoosedNum = chooseANnumberUser1();
		}
	}

	public void checkIsItEmpty(int userChoosedNum,char xOrO){
		boolean getTrueOrFalse = t1.isItEmpty(userChoosedNum);
		while(getTrueOrFalse){
			System.out.println("Obs that's place is full! Play an other place");
			System.out.println("Enter a number again!");
			if(counter%2==1){
				userChoosedNum = chooseANnumberUser1();
				getTrueOrFalse =t1.isItEmpty(userChoosedNum);
			}
			else{
				userChoosedNum = chooseANnumberUser2();
				getTrueOrFalse =t1.isItEmpty(userChoosedNum);
			}
		}
		t1.setValue(userChoosedNum, xOrO);
	}

	public void printOutWinner(boolean isThereAnyWinner, int playerOneOrPlayer2 ){

		if(playerOneOrPlayer2%2==1 && isThereAnyWinner == false){
			System.out.println("\n\t\t*** WINNER "+getUser1().toUpperCase() +" ***\n");
		}

		else if(playerOneOrPlayer2%2==0 && isThereAnyWinner == false ){
			System.out.println("\n\t\t*** WINNER "+getUser2().toUpperCase()+" ***\n");
		}
	}
	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}

	public String getUser2() {
		return user2;
	}

	public void setUser2(String user2) {
		this.user2 = user2;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}

