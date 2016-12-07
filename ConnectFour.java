public class ConnectFour{
	
	
	public static void main(String[] args){
		int q = 0;
		int ai = 0;
		for(int p = 0; p <200; p++){
			
		
		//Print your empty board

		int rando = 0;
		
		
		
		Board y = new Board(6,7);
		AIPlayer1 p1 = new AIPlayer1(1,6,7);
		AIPlayer p2 = new AIPlayer(2,6,7); //uncomment this line when testing AIPlayer
		
			
		int c = 0;
			while( y.canPlay() == true){
				
				System.out.println("player 1 go: ");
				c = p1.playToken();
				y.play(1,c);
				p2.lastMove(c);
				y.PrintBoard();
				if( y.isFinished() == 1 ){
					q++;
					break;
				}
				System.out.println("-------Ai Turn --------------");
				c = p2.playToken();
				y.play(2,c);
				p1.lastMove(c);
				y.PrintBoard();
				if(y.isFinished() == 2){
					ai++;
					break;
				}
				System.out.println("---------------------");

			}
		System.out.println("computer won: "+ q);
		System.out.println("Ai won : "+ ai);
		}
	}
	
}