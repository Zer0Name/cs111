public class PayFriend{
    
    public static void main(String[] args){
        System.out.print("Total amount of money: ");
        double total_money = IO.readDouble();
        double total_fee;
        
 
        
        if (total_money =< 100){
            IO.outputDoubleAnswer(5);
        }else if(total_money > 100 && total_money< 1000) {
            double x = total_money * 0.03;
            double y = 6;
            if (x > y){
                total_fee = x;
                IO.outputDoubleAnswer(total_fee);
            }else{
                total_fee = y;
                IO.outputDoubleAnswer(total_fee);
            }
        }else if (total_money >= 1000 && total_money < 10000){
            double x = total_money * 0.01;
            double y = 15;
            if (x > y){
                total_fee = x;
                IO.outputDoubleAnswer(total_fee);
            }else{
                total_fee = y;
                IO.outputDoubleAnswer(total_fee);
            }
            
        }else if (total_money >= 10000 ){
            total_fee = 100;
            total_money = total_money - 10000;
            
            
            if (total_money >= 5000){
                total_fee = total_fee + 100;
            }else{
                total_fee = total_fee + (total_money * 0.02);
            }
            total_money = total_money - 5000;
            if (total_money <= 0){
                IO.outputDoubleAnswer(total_fee);
            }else{
                total_fee = total_fee + (total_money * 0.03);
                IO.outputDoubleAnswer(total_fee);
            }
        }
    }
}