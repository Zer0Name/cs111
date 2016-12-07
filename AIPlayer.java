
public class AIPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
	private char[][] board;
	int ID = 0;
	char ID1 = 'x';
	char ID2 = 'o';
	int row = 0;
	int col = 0;
	int placeCol = 0;
	int run = 0;

	//constructor takes the player id for this player, and the number of 
	// rows and columns of the board we're playing on
	public AIPlayer(int playerID, int row, int col){
		board = new char[row][col]; 
		ID = playerID;
		this.row = row;
		this.col = col;
		this.placeCol = col -1;
		createBoard();
		
	}
	private void createBoard(){
        for(int x = 0; x < row; x++){
            for(int y = 0; y < col; y++){
                board[x][y] = '0';
            }
        }
    }
	
	//used to notify your AI player of the other players last move
	public void lastMove(int c) {
		for(int x = board.length-1; x >= 0; x-- ){
                if(board[x][c] == '0'){
                    board[x][c] = ID2;
                    break;
                }
            }
    }

	//returns column of where to play a token
	public int playToken(){
		int choice = mainLoop();
		
		if(choice< 0 || choice>col-1 || getToken(0,choice) != '0'){
			System.out.println("error");
		}
		
		
		for(int x = board.length-1; x >= 0; x-- ){
                if(board[x][choice] == '0'){
                    board[x][choice] = ID1;
                    break;
                }
            }
            
		return choice;
	
	}
	
	public char getToken(int row, int col){
        if (row > board.length-1  || col > board[0].length-1 || row < 0 || col < 0){
            return '\0';
        }else{
            return board[row][col];
        }
        
        
    }
	
	public int mainLoop(){
		
		
		if(run == 0){
			System.out.println("run");
			run = 1;
			if(boardEmpty() == true ){
				return goFirst();
			}else{
				return goSecond();
			}
		}

		if(getToken(0,placeCol) == '0'){
			//System.out.println("got to here");
			return placeCol;
		}else{
			placeCol = placeCol -1;
			return placeCol;
		}
		
	}
	
	private boolean boardEmpty(){
		for(int x = 0 ; x < col-1; x++){
			if(board[row-1][x] ==ID2 ){
				return true;
			}
		}
		return false;
	}
	

	
	
	private int goFirst(){
		// get the middle column and place there 
		int len = col-1;
		if (col%2 ==0){
			return len/2;
		}
		else{
			return ((len-1)/2) + 1 ;
		}
		
		
	}
	
	private int goSecond(){
		
		// get location 
		// if its in middle place next to it
		// if its not place in the middle.
		
		
		return 0;
	}
	
	
	public void printBoard(){
        for(int x =0;  x< board.length; x++){
            for(int y = 0; y < board[0].length; y++ ){
            System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }
	
	//get this player's id
	public int getPlayerID(){
		return ID;
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
		createBoard();
		
	}
	

}
