import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class OddEvenTest {

    //           Test Data:
//           -345 →  “Odd”
//           0 →  “Even”
//           222222 →  “Even”
//           2147483647 + 1 →  “Undefined”*/

    @Test
    public void testOddEven_1() {
        //Task 1
        int number = -345;
        String expectedResult = "Odd";

        AscendingSequence as = new AscendingSequence();
        String actualResult = as.getOddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven_2() {
        //Task 1
        int number = 0;
        String expectedResult = "Even";

        AscendingSequence as = new AscendingSequence();
        String actualResult = as.getOddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven_3() {
        //Task 1
        int number = 2222;
        String expectedResult = "Even";

        AscendingSequence as = new AscendingSequence();
        String actualResult = as.getOddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven_4() {
        //Task 1
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        AscendingSequence as = new AscendingSequence();
        String actualResult = as.getOddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



