import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_6_AreNumbersEqual_Test {

//     Test Data:
//     89, 89
//     Expected result: 0
//     -89, 89
//     Expected result: -1
//     89, -89
//     Expected result: 1

    @Test
    public void testAreNumbersEqual_1() {
        //Task 6
        int numberOne = 89;
        int numberTwo = 89;
        int expectedResult = 0;

        HW9_6_AreNumbersEqual HW9_6AreNumbersEqual = new HW9_6_AreNumbersEqual();
        int actualResult = HW9_6AreNumbersEqual.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAreNumbersEqual_2() {
        //Task 6
        int numberOne = -89;
        int numberTwo = 89;
        int expectedResult = -1;

        HW9_6_AreNumbersEqual HW9_6AreNumbersEqual = new HW9_6_AreNumbersEqual();
        int actualResult = HW9_6AreNumbersEqual.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual_3() {
        //Task 6
        int numberOne = 89;
        int numberTwo = -89;
        int expectedResult = 1;

        HW9_6_AreNumbersEqual HW9_6AreNumbersEqual = new HW9_6_AreNumbersEqual();
        int actualResult = HW9_6AreNumbersEqual.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual_2_1() {
        //Task 6
        int numberOne = 89;
        int numberTwo = 89;
        int expectedResult = 0;

        HW9_6_AreNumbersEqual HW9_6AreNumbersEqual = new HW9_6_AreNumbersEqual();
        int actualResult = HW9_6AreNumbersEqual.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAreNumbersEqual_2_2() {
        //Task 6
        int numberOne = -89;
        int numberTwo = 89;
        int expectedResult = -1;

        HW9_6_AreNumbersEqual HW9_6AreNumbersEqual = new HW9_6_AreNumbersEqual();
        int actualResult = HW9_6AreNumbersEqual.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual_2_3() {
        //Task 6
        int numberOne = 89;
        int numberTwo = -89;
        int expectedResult = 1;

        HW9_6_AreNumbersEqual HW9_6AreNumbersEqual = new HW9_6_AreNumbersEqual();
        int actualResult = HW9_6AreNumbersEqual.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
