public class StringRec{
    
    public static void main(String[] args){
        
        System.out.println(decompress("q9w5e2rt5y4qw2Er3T"));
        
    }
    
    public static String decompress(String compressedText){
        // base case
        if(compressedText.length() == 0  || compressedText.length() == 1){
            return compressedText;
        }else{
            // if the first value is a character, no
            if(Character.isLetter(compressedText.charAt(0) ) ){
                return compressedText.charAt(0)  + decompress(compressedText.substring(1));
            }else{
                // basecase for mutiple letters
                if(compressedText.charAt(0) == '0'){
                    return decompress(compressedText.substring(2));
                }else{
                    char c = compressedText.charAt(0);
                    char x = compressedText.charAt(1);
                    int value = c - '0';
                    compressedText = Integer.toString(value -1) + x + compressedText.substring(2);
                    return x + decompress(compressedText);
                }
            }
        }
    }
}