import java.util.Random;
public class AIPlayer1 implements Player{
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
	public AIPlayer1(int playerID, int row, int col){
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
		
		Random ran = new Random();
		int choice = ran.nextInt(7);

		while(choice< 0 || choice>col-1 || getToken(0,choice) != '0'){
			choice = ran.nextInt(7);
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
	
	//get this player's id
	public int getPlayerID(){
		return ID;
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
		createBoard();
		
	}
	

}
