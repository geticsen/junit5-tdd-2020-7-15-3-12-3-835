package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzWhizzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1(){
        //given
        int number = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //then
        Assertions.assertEquals("1",actual);
    }
    @Test
    void should_return_fizz_when_play_fizz_buzz_whizz_given_3(){
        //given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //then
        Assertions.assertEquals("fizz",actual);
    }
    @Test
    void should_return_buzz_when_play_fizz_buzz_whizz_given_5(){
        //given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //then
        Assertions.assertEquals("buzz",actual);
    }
    @Test
    void should_return_whizz_when_play_fizz_buzz_whizz_given_7(){
        //given
        int number = 7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        //when
        String actual = fizzBuzzWhizz.play(number);
        //then
        Assertions.assertEquals("whizz",actual);
    }
}