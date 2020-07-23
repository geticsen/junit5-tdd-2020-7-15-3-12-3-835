package junit5.tdd;

public class FizzBuzzWhizz {
    public String play(int number) {
        if (number % 3 == 0&&number % 5 == 0&&number % 7 == 0) {
            return "fizzbuzzwhizz";
        }
        if (number % 3 == 0&&number % 7 == 0) {
            return "fizzwhizz";
        }
        if (number % 3 == 0&&number % 5 == 0) {
            return "fizzbuzz";
        }
        if (number % 5 == 0&&number % 7 == 0) {
            return "buzzwhizz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        if (number % 7 == 0) {
            return "whizz";
        }
        return String.valueOf(number);
    }

}
