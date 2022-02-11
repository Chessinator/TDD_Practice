import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;


public class MainTest {

    Main testObject= new Main();

    @Test
    void testMainFizzBuzz_ReturnsAString(){
        //GIVEN
        //WHEN
        //THEN
        assertTrue(testObject.fizzBuzz(0) instanceof String);
    }

    @Test
    void testMainFizzBuzz_ReturnsFizz_WhenGiven3(){
        //GIVEN
        String expected = "Fizz";
        //WHEN
        String actual = testObject.fizzBuzz(3);
        //THEN
        assertEquals(true, expected.equals(actual));
    }

    @Test
    void testMainFizzBuzz_ReturnsBuzz_Given5(){
        //GIVEN
        String expected = "Buzz";
        //WHEN
        String actual = testObject.fizzBuzz(5);
        //THEN
        assertEquals(true, expected.equals(actual));
    }

    @Test
    void testMainFizzBuzz_ReturnsFizzBuzz_WhenIntIsDivisableBy3And5(){
        //GIVEN
        String expected = "FizzBuzz";
        //WHEN
        String actual = testObject.fizzBuzz(15);
        //THEN
        assertEquals(true, expected.equals(actual));
    }

    @Test
    void testMainFizzBuzz_ReturnsNumberAsString_WhenNoConditionFits(){
        //GIVEN
        String expected = "0";
        //WHEN
        String actual = testObject.fizzBuzz(0);
        //THEN
        assertEquals(expected, actual);
    }


}
