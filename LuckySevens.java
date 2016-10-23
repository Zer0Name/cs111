public class LuckySevens{
    public static void main(String[] args){
        
        System.out.println("lower bound");
        int lower = IO.readInt();
        
        System.out.println("upper bound");
        int upper = IO.readInt();
        
        String integer = "";
        int count = 0;
        
        if(lower > upper){
            IO.reportBadInput(); // report that there is bad input
            return;
        }
        
        // iterate through all the numbers
        for(int x = lower; x <= upper; x++){
              integer = Integer.toString(x);
            for (int i=0; i < integer.length(); i++) { // iterate through the int string 
                char c = integer.charAt(i);
                if( c == '7'){
                    count++;
                }
            }
        }
     IO.outputIntAnswer(count);
    }
}