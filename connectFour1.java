public class connectFour{
    public static void main(String[] args){
        
        Board y = new Board(10,10);
        // c.Board(10,10);
        
        System.out.println(y.isFinished()); 
        System.out.println("Answer -1: ");
        
        System.out.print("number for row: ");  // 10
        System.out.println(y.getNumRows());
        
        System.out.print("number for columns: "); // 10
        System.out.println(y.getNumCols());
        
        y.setPlayerOne('M');
        System.out.println(y.getPlayerOne());  // M
        
        y.setPlayerTwo('P');
        System.out.println(y.getPlayerTwo()); // P
        
        System.out.println(y.canPlay()); // True
        
        y.PrintBoard();
        
        for(int x = 0; x < 10; x++){
            for(int k = 0; k < 10; k++){
                y.play(1, k);
            }
        }
        
        System.out.println("--------------------");
        
        y.PrintBoard();
        
        System.out.println(y.canPlay()); // Flase
        
        
        System.out.println(y.play(1, 1)); // False
        
        System.out.println(y.play(1, 10)); // False
        
        System.out.println(y.play(1, -1)); // False
        
        
        
        System.out.println("checking vertical: ");
        Board x = new Board(4,4);
        //x.Board(4, 4);
        x.play(1,3);
        x.play(1,3);
        x.play(1,3);
        x.play(1,3);
        x.PrintBoard();
        System.out.println(x.isFinished()); // 1
        
        System.out.println("--------------------");
        
        Board l = new Board(4,4);
        //y.Board(4, 4);
        l.play(2,3);
        l.play(2,3);
        l.play(2,3);
        l.play(2,3);
        l.PrintBoard();
        System.out.println(l.isFinished()); // 2
        
        System.out.println("--------------------");
        
        
        System.out.println("checking horizantal: ");
        
        
        Board z = new Board(4,4);
        z.play(1,0);
        z.play(1,1);
        z.play(1,2);
        z.play(1,3);
        // z.PrintBoard();
        System.out.println(z.isFinished()); // 1
        
        System.out.println("--------------------");
        
        Board q = new Board(4,4);
        //q.Board(4,4);
        q.play(2,0);
        q.play(2,1);
        q.play(2,2);
        q.play(2,3);
        
        System.out.println(q.isFinished()); // 2
        
        System.out.println("--------------------");
        
        
        System.out.println("--------------------");
        
        
        Board w = new Board(4,4);
        // w.Board(4,4);
        
        w.play(1,3);
        
        w.play(2, 2);
        w.play(1, 2);
        
        w.play(2, 1);
        w.play(2, 1);
        w.play(1, 1);
        
        w.play(2, 0);
        w.play(2, 0);
        w.play(2, 0);
        w.play(1, 0);

        
        w.PrintBoard();

        
        System.out.println(w.isFinished()); // 1
        
        System.out.println("-------------------");
        
        Board t = new Board(4,4);
        //t.Board(4,4);
        
        t.play(1,0);
        
        t.play(2,1);
        t.play(1,2);
        t.play(2,3);
        
        t.PrintBoard();
        System.out.println(t.isFinished());
        
        
        
        System.out.println("-------------------");
        
       Board o = new Board(5,5);
        
        //o.Board(3,3);
        
        o.play(1,0);
        o.play(1,1);
        o.play(2,2);
        o.play(2,2);
        o.play(2,2);
        o.play(2,2);
        o.play(1,3);
        o.play(1,4);
        System.out.println("test"); 

        
        o.PrintBoard();
        
        System.out.println(o.isFinished()); // 2
        
            	System.out.println("NIKKI");
            	
            	System.out.println("test");
    	Board c = new Board(5,5);
    	
    	c.play(1, 0);
    	c.play(1, 1);
    	c.play(1, 2);
    	c.play(2, 3);
    	c.play(1, 4);
    	
    	c.play(1, 0);
    	c.play(2, 1);
    	c.play(2, 2);
    	c.play(1, 3);
    	c.play(1, 4);
    	
    	c.play(2, 0);
    	c.play(2, 1);
    	c.play(2, 2);
    	c.play(1, 3);
    	c.play(1, 4);
    	
    	c.play(2, 0);
    	c.play(1, 1);
    	c.play(2, 2);
    	c.play(2, 3);
    	c.play(2, 4);

    	
    	
    	System.out.println(c.isFinished());
    	System.out.println("000000000000000000"); // 2
    	
    	c.PrintBoard();
    
        
    }
}