public class HumanPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
	int ID = 0;
	int lastmove = -1;
	private char[][] board;
	int row = 0;
	int col = 0;
	char id1 = 'x';
	char id2 = 'o';
	
	//constructor takes the player id for this player, and the number of 
	// rows and columns of the board we're playing on
	public HumanPlayer(int playerID, int row, int col){
		board = new char[row][col]; 
		ID = playerID;
		this.row = row;
		this.col = col;
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
                    board[x][c] = id2;
                    break;
                }
            }
    }
		
		
	
	
	public char getToken(int row, int col){
        if (row > board.length-1  || col > board[0].length-1 || row < 0 || col < 0){
            return '\0';
        }else{
            return board[row][col];
        }
        
        
    }
	
	//returns column of where to play a token
	public int playToken(){
		int choice = IO.readInt();
		
		while(choice< 0 || choice>col-1 || getToken(0,choice) != '0'){
			IO.reportBadInput();
			choice=IO.readInt();
		}
		for(int x = board.length-1; x >= 0; x-- ){
                if(board[x][choice] == '0'){
                    board[x][choice] = id1;
                    break;
                }
            }
		return choice;
		
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