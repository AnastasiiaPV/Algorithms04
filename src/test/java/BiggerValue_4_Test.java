import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValue_4_Test {

//        Test Data:
//        3333, 9999
//        Expected Result = 9999


    @Test
    public void testBiggerValue_1() {
        //Task 4
        int numberOne = 3333;
        int numberTwo = 9999;
        int expectedResult = 9999;

        BiggerValue_4 biggerValue = new BiggerValue_4();
        int actualResult = biggerValue.getBiggerValue(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValue_2() {
        //Task 4
        int numberOne = 3333;
        int numberTwo = 9999;
        int expectedResult = 9999;

        BiggerValue_4 biggerValue = new BiggerValue_4();
        int actualResult = biggerValue.getBiggerValue_2(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
