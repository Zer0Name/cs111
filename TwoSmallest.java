public class TwoSmallest{
    public static void main(String[] args){
        
        // get terminating value 
        System.out.println("Terminating value");
        double term = IO.readDouble();
        
        double smallest = 0;
        double small    = 0;
        
        
            System.out.println("first input");
            double input1 = IO.readDouble();
            
            // check to make sure first value 
            while (term == input1){
                System.out.println("no good");
                IO.reportBadInput(); // report that there is bad input
                input1 = IO.readDouble();
            }
            smallest = input1;
            
            System.out.println("second input");
            double input2 = IO.readDouble();
            
            // check to make sure second value 
            while (term == input2){
                System.out.println("no good");
                IO.reportBadInput(); // report that there is bad input
                input2 = IO.readDouble();
            }
            
            if (input2 < smallest){
                small = smallest;
                smallest = input2;
            }else{
                small = input2;
            }
            
        double input3 = term + 1;   
        
        while(input3 != term){
            System.out.println("enter value");
            input3 = IO.readDouble();
            if(input3 == term){
            }else{
            if(input3 < smallest){
                small = smallest;
                smallest = input3;
            } else if(input3 < small){
                small = input3;
            }
            }
        }
        IO.outputDoubleAnswer(smallest);
        IO.outputDoubleAnswer(small);
           
        
        
    }
}