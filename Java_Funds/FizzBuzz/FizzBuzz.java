public class FizzBuzz {
    public String fizzBuzz(int number){
        String abuzz = "";
        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
                abuzz += " Fizz";
            } else if (i % 5 == 0 && i % 3 != 0){
                System.out.println("Buzz");
                abuzz += " Buzz";
            } else if (i % 15 == 0){
                System.out.println("FizzBuzz");
                abuzz += " Fizzbuzz";
            } else {
                System.out.println("z");
                abuzz += " z";
            }
        }
        return abuzz;
    }
}