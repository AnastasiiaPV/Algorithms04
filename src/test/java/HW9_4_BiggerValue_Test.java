import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_4_BiggerValue_Test {

//        Test Data:
//        3333, 9999
//        Expected Result = 9999


    @Test
    public void testBiggerValue_1() {
        //Task 4
        int numberOne = 3333;
        int numberTwo = 9999;
        int expectedResult = 9999;

        HW9_4_BiggerValue biggerValue = new HW9_4_BiggerValue();
        int actualResult = biggerValue.getBiggerValue(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValue_2() {
        //Task 4
        int numberOne = 3333;
        int numberTwo = 9999;
        int expectedResult = 9999;

        HW9_4_BiggerValue biggerValue = new HW9_4_BiggerValue();
        int actualResult = biggerValue.getBiggerValue_2(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
