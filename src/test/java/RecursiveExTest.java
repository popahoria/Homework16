import org.assertj.core.api.Assertions;
import org.fasttrackit.RecursiveEx;
import org.junit.jupiter.api.Test;

public class RecursiveExTest {


    @Test
    public void testSumOfFirstNIntegerNumbers() {

        int n = 6;

        int result = RecursiveEx.sumOfFirstNIntNumber(n);

        Assertions.assertThat(result).isEqualTo(21);
    }

    @Test
    public void testSumOfFirstNEvenIntegers() {

        int n = 5;

        Integer result = RecursiveEx.sumOfFirstNEvenInt(n);

        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void testSumOfFirstNEvenIntegerNumbers() {

        int n = 5;

        Integer result = RecursiveEx.sumOfFirstNIntNumber(n);

        Assertions.assertThat(result).isEqualTo(15);
    }

    @Test
    public void testCheckIfPalindrome() {

        String word = "madam";

        Boolean result = RecursiveEx.checkIfPalindrome(word);

        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void testisPalindrome() {

        String word = "madam";

        Boolean result = RecursiveEx.isPalindrome(word, 0);

        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void testSumOfDigitsForANumber() {

        int n = 9876;

        Integer result = RecursiveEx.sumOfDigitsForANumber(n);

        Assertions.assertThat(result).isEqualTo(30);
    }


    @Test
    public void testFibonacciArray() {

        int n = 8;

        Integer result = RecursiveEx.fibonacciArray(n);

        Assertions.assertThat(result).isEqualTo(13);
    }

}
