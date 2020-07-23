package junit5.tdd;

public class FizzBuzzWhizz {
    public String play(int number) {
        String line = "";
        if (number % 3 == 0) {
            line+= "fizz";
        }
        if (number % 5 == 0) {
            line+=  "buzz";
        }
        if (number % 7 == 0) {
            line+=  "whizz";
        }
        if (line.equals("")){
            line = String.valueOf(number);
        }
        return line;
    }

}
