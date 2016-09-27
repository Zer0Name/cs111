public class Sum{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        int first_num = IO.readInt();
        System.out.println("");
        System.out.print("Enter number: ");
        int second_num = IO.readInt();
        int sum = first_num + second_num;
        IO.outputIntAnswer(sum);
    }
}