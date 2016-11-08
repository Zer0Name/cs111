public class PigLatin{
    
    public static void main(String[] args){
        System.out.println(translate(""));
        
        
        
    }
    
    public static String translate (String original){
        
        original.toLowerCase();
        if(original.charAt(0) == 'a' || original.charAt(0) == 'e' ||original.charAt(0) == 'i'|| original.charAt(0) == 'o'|| original.charAt(0) == 'u'){
        return original+"way" ;
        }else{
            char y = original.charAt(0);
            return original.substring(1) +y + "ay";
        }
    }
}