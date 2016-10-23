public class SmallestLargest{
    public static void main(String[] args){
        // get terminating value 
        double term = IO.readDouble();
        
        // get input for starting list 
        double input = 0;
        input = IO.readDouble();
        
        //check to make sure atleast one number is in the list
        while (term == input){
            IO.reportBadInput(); // report that there is bad input
            return;
        }
        // set the first value to both the largest and smallest number
        double largenum = input;
        double smallnum = input;
    
        // run through until terminating value is reached
        while (term != input){
            input = IO.readDouble();
            if (input == term){
                
            }else{
                if (input > largenum){
                    largenum = input;
                }else if( input < smallnum){
                    smallnum = input;
                
                }
            }
        }
            
        IO.outputDoubleAnswer(largenum);
        IO.outputDoubleAnswer(smallnum);
        }
    }