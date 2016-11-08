public class WordCount{
    
    public static void main(String[] args){
        System.out.println(countWords("    LK HJGJ LK L           ",6));
    }
    
    public static int countWords(String original, int minLength){
        original = original + " "; 
        
        int word_count = 0;
        int total_count = 0;

        for(int i = 0; i < original.length(); i++){
            

            if(Character.isLetter(original.charAt(i)) ==  true){
                word_count++;
            }else if(original.charAt(i) != ' ') {
                
            }else if (word_count != 0){
                if(word_count >= minLength){
                    total_count++;
                }
                word_count = 0;
            }
        }
 
        return total_count;
    }
}



