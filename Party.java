public class Party{
    
    public static void main(String[] args){
        System.out.println("How many people are coming to the party");
        int total_people = IO.readInt();
        
        System.out.println("how many slices of pizza can someone eat");
        int pizza_per_person = IO.readInt();

        System.out.println("how many cans of soda can a person drink");
        int cans_of_sada_per_person = IO.readInt();

        System.out.println("what is a cost of a pie of pizza");
        double pie_cost = IO.readDouble();
        
        System.out.println("How many slices in a pie");
        int pie_slices_per_box = IO.readInt();
        
        System.out.println("what is a cost of a case of soda");
        double soda_case_cost = IO.readDouble();
        
        System.out.println("How many soda cans in a case");
        int amount_of_cans_per_case = IO.readInt();
        
        
        
        int total_slices = total_people * pizza_per_person;
        int total_cans = total_people * cans_of_sada_per_person;
        
        int pies = 0;
        int cases = 0;
        
        double total_cost_of_pie;
        double total_cost_of_soda;
        
        while (total_slices > 0 ){
            pies = pies + 1;
            total_slices = total_slices - pie_slices_per_box;
        }
        
        total_cost_of_pie = pies * pie_cost;
        
        while (total_cans > 0){
            cases = cases + 1;
            total_cans = total_cans - amount_of_cans_per_case;
        }
        total_cost_of_soda = cases * soda_case_cost;
        
        double total_cost = Math.round((total_cost_of_soda + total_cost_of_pie) * 100.0) / 100D;
        IO.outputDoubleAnswer(total_cost);

        
        
        
        
    }
}