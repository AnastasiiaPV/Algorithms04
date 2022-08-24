import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class SumArray_3_Test {

//     Test Data:
//     {0, 1, 2, 3, 4, 5} → 15
//     {-7, -3} → -10

    @Test
    public void testSumArray_1() {
        //Task 3
        int[] input = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray_3 sumArray_3 = new SumArray_3();
        int actualResult = sumArray_3.getSumArray(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArray_2() {
        //Task 3
        int[] input = new int[]{-7, -3};
        int expectedResult = -10;

        SumArray_3 sumArray_3 = new SumArray_3();
        int actualResult = sumArray_3.getSumArray(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
