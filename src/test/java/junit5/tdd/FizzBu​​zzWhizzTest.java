package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBu​​zzWhizzTest {
    @Test
    void should_return_1_when_play_fizz_buzz_whizz_given_1(){
        //given
        int number = 1;
        FizzBu​​zzWhizz fizzBu​​zzWhizz = new FizzBu​​zzWhizz();
        //when
        String actual = fizzBu​​zzWhizz.play(number);
        //then
        Assertions.assertEquals("1",actual);
    }
}
