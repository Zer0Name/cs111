public class Compress{
    
    public static void main(String[] args){
        System.out.println(compress("      "));


    }
    
    public static String compress (String original){
        original = original + " ";
        
        boolean start_up = true;
        String x = " ";
        char y = ' ';
        
        for(int i = 0; i < original.length(); i++){
            if(start_up == true){
                y = original.charAt(i);
                start_up = false;
            }else{
                if (original.charAt(i) == y){
                }else{
                    x = x + count(original.substring(0,i)); 
                    //System.out.println(x);
                    original = original.substring(i);
                    //System.out.println(original);
                    y = original.charAt(0);
                    //System.out.println(y);
                    i = 0;

                }
            } 
        }
        
        return x.substring(1,x.length());
    }
    public static String count(String original){
        //System.out.println(original);
        int total = 0;
        char x = ' ';
        
        x = original.charAt(0);
        total = original.length();
        if(total == 1){
            return Character.toString(x);
        }else{
            return Integer.toString(total) + Character.toString(x) ;
        }
        
    }
    
    
}