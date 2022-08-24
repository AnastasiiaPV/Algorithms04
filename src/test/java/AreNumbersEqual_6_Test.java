import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class AreNumbersEqual_6_Test {

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

        AreNumbersEqual_6 areNumbersEqual_6 = new AreNumbersEqual_6();
        int actualResult = areNumbersEqual_6.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAreNumbersEqual_2() {
        //Task 6
        int numberOne = -89;
        int numberTwo = 89;
        int expectedResult = -1;

        AreNumbersEqual_6 areNumbersEqual_6 = new AreNumbersEqual_6();
        int actualResult = areNumbersEqual_6.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual_3() {
        //Task 6
        int numberOne = 89;
        int numberTwo = -89;
        int expectedResult = 1;

        AreNumbersEqual_6 areNumbersEqual_6 = new AreNumbersEqual_6();
        int actualResult = areNumbersEqual_6.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual_2_1() {
        //Task 6
        int numberOne = 89;
        int numberTwo = 89;
        int expectedResult = 0;

        AreNumbersEqual_6 areNumbersEqual_6 = new AreNumbersEqual_6();
        int actualResult = areNumbersEqual_6.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAreNumbersEqual_2_2() {
        //Task 6
        int numberOne = -89;
        int numberTwo = 89;
        int expectedResult = -1;

        AreNumbersEqual_6 areNumbersEqual_6 = new AreNumbersEqual_6();
        int actualResult = areNumbersEqual_6.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqual_2_3() {
        //Task 6
        int numberOne = 89;
        int numberTwo = -89;
        int expectedResult = 1;

        AreNumbersEqual_6 areNumbersEqual_6 = new AreNumbersEqual_6();
        int actualResult = areNumbersEqual_6.checkAreNumbersEqual(numberOne, numberTwo);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
