
public class CheckWinner extends Table{


	public boolean checkWinnerRow(char value){
		int i = 0;
		boolean checkIsThereAnyWIn =  true;

		while(i<3 && checkIsThereAnyWIn)	{

			if(i==0){
				if(array[i][i] ==  value  &&	array[i][i+1] == value && 	array[i][i+2] == value){ // row 0
					checkIsThereAnyWIn = false;

				}
				else if(array[i][i] == value  &&	array[i+1][i] == value && 	array[i+2][i] == value){ // col 0
					checkIsThereAnyWIn = false;

				}
				else if(array[i][i] == value &&	array[i+1][i+1] == value && 	array[i+2][i+2] == value){ // cross 00 to 22
					checkIsThereAnyWIn = false;

				}
				else{
					checkIsThereAnyWIn = true;
				}

			}

			if(i==1){
				if(array[i][i-1] == value  &&	array[i][i] == value && 	array[i][i+1] == value){ // row 1
					checkIsThereAnyWIn = false;

				}

				else if(array[i-1][i] == value  &&	array[i][i] == value && 	array[i+1][i] == value){ // col 1
					checkIsThereAnyWIn = false;


				}	
				else{
					checkIsThereAnyWIn = true;
				}


			}

			if(i==2){		
				if(array[i][i-2] == value  &&	array[i][i-1] == value && 	array[i][i] == value){ // row 2
					checkIsThereAnyWIn = false;
				}

				else if(array[i-2][i] == value  &&	array[i-1][i] == value && 	array[i][i] == value){ // col 2
					checkIsThereAnyWIn = false;

				}		

				else if(array[i][i-2] == value  &&	array[i-1][i-1] == value && 	array[i-2][i] == value){ // cross 20 to 02
					checkIsThereAnyWIn = false;

				}		
				else{
					checkIsThereAnyWIn = true;
				}

			}
			i++;
		}	

		return checkIsThereAnyWIn;

	}
	
	/*
	
	public boolean checkWinnerRow(char value){
		int i=0;
		boolean checkWinnerRow = true;
		while(i<3)
		{
			if(array[i][0] == value && array[i][1] == value && array[i][2] == value){
				System.out.println("Kk");
			checkWinnerRow = false;

			}
			else if(array[0][i] == value && array[1][i] == value && array[1][i] == value){
				checkWinnerRow = false;
			}
			else if(array[0][0] == value && array[1][1] == value && array[2][2] == value){
				checkWinnerRow = false;

			}
			else if(array[2][0] == value && array[1][1] == value && array[0][2] == value){
				checkWinnerRow = false;

			}
			
			else{
				i++;
				checkWinnerRow = true;
			}

		}
		return checkWinnerRow;
	}
	*/
}





