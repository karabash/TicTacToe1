public class Table{

	static final char[][] array = new char[3][3];
	
	
	public void table() {
		int counter =0;
		System.out.println("\t --------------------------");
		
		for(int i= 0; i<array.length; i++){
			
			for(int j =0; j<array[i].length; j++){
				System.out.print("\t");
				
				array[i][j] =(char)('0'+(counter));
				
				counter++;
				System.out.print(" |   "+array[i][j]);
			}
			System.out.print("    |");
			System.out.println("\n\t --------------------------");

		}

	}

	public void setValue(int possition, char value){
		int x = possition / 3;
		int o = possition % 3;
		array[x][o] = value;
	}


	public void printOut(){
		System.out.println("\t   --------------------------");

		for(int i= 0; i<array.length; i++){
			System.out.print("\t");

			for(int j =0; j<array[i].length; j++){



				System.out.print("   |   "+array[i][j]);

			}
			System.out.print("    |");
			System.out.println("\n\t   --------------------------");		}
	}
	
	public boolean isItEmpty(int possition){
		boolean check = true;
		int x = possition / 3;
		int o = possition % 3;
		if(array[x][o] == 'X' || array[x][o] == 'O'){
			return check;
		}
			
		else{
			return !check;
		}
	}
}