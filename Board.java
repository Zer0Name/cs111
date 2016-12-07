public class Board{
    // inilaized varables
    
    //[row][col]
    private char[][] board;
    private char playerOne = 'x';
    private char playerTwo = 'o';
    
    public Board(){
        board = new char[6][7];
        createBoard();
    }
    
    public Board(int row, int col) { 
        board = new char[row][col];
        createBoard();
    }
    
    private void createBoard(){
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
                board[x][y] = ' ';
            }
        }
    }
    
    public void PrintBoard(){
        for(int x =0;  x< board.length; x++){
            for(int y = 0; y < board[0].length; y++ ){
            System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }
    
    public int getNumRows(){
        return board.length;
    } 
    public int getNumCols(){
        return board[0].length;
    }
    
    //returns char representing player 1
    public char getPlayerOne(){ 
        return playerOne;
    } 
    //returns char representing player 2
    public char getPlayerTwo(){
        return playerTwo;
    } 
    
    //sets char representing player 1
    public void setPlayerOne(char o){
        playerOne = o;
    }
    //sets char representing player 2
    public void setPlayerTwo(char t){
        playerTwo = t;
    } 
    
    public char getToken(int row, int col){
        if (row > board.length-1  || col > board[0].length-1 || row < 0 || col < 0){
            return '\0';
        }else{
            return board[row][col];
        }
        
        
    }
    
    public boolean canPlay(){
        for(int x = 0; x<board[0].length; x++){
            if(board[0][x] == ' '){
                return  true;
            }
        }
        return false;
    }
    
    
    public boolean play(int p, int c){

        // check to see if the top row is full 
        if( c > board[0].length-1 || c < 0 || board[0][c] !=' ' ){
            return false;
        }
        if (p != 1 && p != 2){
            return false;
        }

        if( p == 1){
            for(int x = board.length-1; x >= 0; x-- ){
                if(board[x][c] == ' '){
                    board[x][c] = playerOne;
                    break;
                }
            }
        }

        if( p == 2){
            for(int x = board.length-1; x >= 0; x-- ){
                if(board[x][c] == ' '){
                    board[x][c] = playerTwo;
                    break;
                }
            }
        }
        return true;
    }
    

    
    public int  isFinished(){
        
        System.out.println("starting horizantal check: ");
        
        if (horizantal() != 'f'){
            if (horizantal() == playerOne){
                return 1;
            }else{
                return 2;
            }
        }
        
        
        System.out.println("starting vertical check: ");
        
        if (vertical() != 'f'){
            if (vertical() == playerOne){
                return 1;
            }else{
                return 2;
            }
        }

        System.out.println("Starting dignal check: ");
        
        if (diagnal() != 'f'){
            if (diagnal() == playerOne){
                return 1;
            }else{
                return 2;
            }
        }
        
        flip();
        
        if (diagnal() != 'f'){
            if (diagnal() == playerOne){
                flip();
                return 1;
            }else{
                flip();
                return 2;
            }
        }
        
        flip();
        
        
        if(canPlay() == true){
            return -1;
        }
        
        

       return 0; 
        
        
    }
    
    
    public void flip(){
        char[][] board1;
        board1 = new char[getNumRows()][getNumCols()];
        int y = 0;
        for(int x = board.length-1; x >=0; x-- ){
            board1[y] = board[x];
            y++;
        }

        for(int z = 0; z < board.length; z++ ){
           board[z] = board1[z] ;
        }
    }
    


    
    private char horizantal(){
        for(int x =0; x <= board.length-1; x++ ){
            if(arrayCheck(board[x]) == playerOne){
                return playerOne;
            }else if ( arrayCheck(board[x]) == playerTwo){
                return playerTwo;
            }
        }
        return 'f';
    }
    
    
    private char vertical(){
        char[] array = new char[getNumRows()];
           // make an array that has the same length of rows
        for(int x  = 0; x < board.length; x++){  // loop thorugh every row
            for (int y = 0 ; y < board[0].length-1; y++){ // loop through every column
                array[y] = board[y][x];  // set array equal to each input for every column.
            }
            if(arrayCheck(array) == playerOne){
                return playerOne;
            }else if ( arrayCheck(array) == playerTwo){
                return playerTwo;
            }
            
        }
        return 'f';

        
    }
    
    
    
    private char diagnal(){
        
        
        // check top half 
        int total = 0;
        int c = 0;
        for(int x = 0; x < board[0].length;x++){
            int q = 0;
            //System.out.println("rest array");
            if (getNumRows() > getNumCols()){
                q = getNumRows();
            }else{
                q = getNumCols();
            }
            char[] array = new char[q];
            
            
            if(total >=  board[0].length){
                break;
            }
            x = 0;
            for(int y =c; y<= board.length; y++){
                if  (x > board.length-1){
                    break;
                }else if( y > board[0].length-1){    
                    break;
                }
                array[y] = getToken(x, y);
                //System.out.println("x: " + x + " y: " + y);
                x = x+1;
            }
            for(int g =0; g< array.length;g++){
                //System.out.print(array[g]);
            }
            
            if(arrayCheck(array) == playerOne){
                return playerOne;
            }else if ( arrayCheck(array) == playerTwo){
                return playerTwo;
            }
            
            total = total +1; 
            x = 0;
            c = c + 1; 
        }
        
        // check bottom half 
        
        total = 0;
        c = 0;
        for(int x = 0; x < board.length;x++){
            if(total >=  board.length){
                break;
            }
            int q = 0;
            //System.out.println("rest array");
            if (getNumRows() > getNumCols()){
                q = getNumRows();
            }else{
                q = getNumCols();
            }
            char[] array = new char[q];
            
            x = 0;
            for(int y =c; y<= board[0].length; y++){
                if  (x > board[0].length-1){
                    break;
                }else if( y > board.length-1){    
                    break;
                }
                array[y] = getToken(y, x);
                //System.out.println("second"+"y: " + y + " x: " + x);
                x = x+1;
            }
            if(arrayCheck(array) == playerOne){
                return playerOne;
            }else if ( arrayCheck(array) == playerTwo){
                return playerTwo;
            }
            total = total +1; 
            x = 0;
            c = c + 1; 
        }
        
        return 'f';
    }
    
    
    private char arrayCheck(char[] array){
        // for(int k = 0; k < array.length; k++){
        //     System.out.print(array[k]);
        // }
        // System.out.println();
        int len = array.length-4; 
        if (len < 0){
            return 'f';
        }
        // System.out.println("print this: " +len);
        
        for(int x =0; x <=len; x++){
            
            if(array[x] == playerOne && array[x+1] == playerOne && array[x+2] == playerOne && array[x+3] == playerOne ){
                return playerOne;
            }
            if(array[x] == playerTwo && array[x+1] == playerTwo && array[x+2] == playerTwo && array[x+3] == playerTwo ){
                return playerTwo;
            }
        }
        return 'f';

    }
    
    
}