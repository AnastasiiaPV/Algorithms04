import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_3_SumArray_Test {

//     Test Data:
//     {0, 1, 2, 3, 4, 5} → 15
//     {-7, -3} → -10

    @Test
    public void testSumArray_1() {
        //Task 3
        int[] input = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        HW9_3_SumArray sumArray_3 = new HW9_3_SumArray();
        int actualResult = sumArray_3.getSumArray(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArray_2() {
        //Task 3
        int[] input = new int[]{-7, -3};
        int expectedResult = -10;

        HW9_3_SumArray sumArray_3 = new HW9_3_SumArray();
        int actualResult = sumArray_3.getSumArray(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
