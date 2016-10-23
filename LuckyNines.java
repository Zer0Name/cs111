public class LuckyNines{
    
    public static void main(String[] args){
        
        System.out.println("lower bound");
        int lowerEnd = IO.readInt();
        
        System.out.println("upper bound");
        int upperEnd = IO.readInt();
        
        int x = countLuckyNines(lowerEnd, upperEnd);
        IO.outputIntAnswer(x);
        
    }
    
    public static int countLuckyNines(int lowerEnd, int upperEnd){
        String integer = "";
        int count = 0;
        if(lowerEnd > upperEnd){
            IO.reportBadInput(); // report that there is bad input
            return -1;
        }
        
        // iterate through all the numbers
        for(int x = lowerEnd; x <= upperEnd; x++){
            integer = Integer.toString(x);
            for (int i=0; i < integer.length(); i++) { // iterate through the int string 
                char c = integer.charAt(i);
                if( c == '9'){
                    count++;
                }
            }
        }
        return count;
        
        
    }
  
}