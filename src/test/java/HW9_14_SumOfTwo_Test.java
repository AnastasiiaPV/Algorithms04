import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HW9_14_SumOfTwo_Test {

//        Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}


    @Test
    public void testSumOfTwo() {
        //Task 14
        int[] input = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int num = 12;
        int[][] expectedResult = new int[][]{{3, 9}, {7, 5}};

        HW9_14_SumOfTwo sumOfTwo_14 = new HW9_14_SumOfTwo();
        int[][] actualResult = sumOfTwo_14.getSumOfTwo(input, num);

        assertArrayEquals(expectedResult, actualResult);
    }
}
