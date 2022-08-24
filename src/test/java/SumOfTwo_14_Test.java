import org.junit.gen5.api.Assertions;
import org.junit.gen5.api.Test;

public class SumOfTwo_14_Test {

//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}


    @Test
    public void testSumOfTwo() {
        //Task 14
        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int num = 12;
        int[][] expectedResult = new int[][]{{3, 9}, {7, 5}};

        SumOfTwo_14 sumOfTwo_14 = new SumOfTwo_14();
        int[][] actualResult = sumOfTwo_14.getSumOfTwo(input, num);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
