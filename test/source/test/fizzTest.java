package test;

import dssc.fizzBuzz;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class fizzTest {

    @Test
    void isFizz(){
        assertThat(fizzBuzz.print(3), is("Fizz"));
    }

    @Test
    void isBuzz(){
        assertThat(fizzBuzz.print(5), is("Buzz"));
    }

    @Test
    void isFizzBuzz(){
        assertThat(fizzBuzz.print(15), is("FizzBuzz"));
    }

    @Test
    void isBang(){
        assertThat(fizzBuzz.print(7), is( "Bang" ));
    }

    @Test
    void isBuzzBang() {assertThat(fizzBuzz.print(35), is("BuzzBang"));}

    @Test
    void isThirtheen() {assertThat(fizzBuzz.print(13), is("13"));}
}
