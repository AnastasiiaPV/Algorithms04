import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW9_15_NumberOccurrences_Test {

//        Test Data:
//        {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
//        {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}

    @Test
    public void testNumberOccurrences() {
        //Task 15
        int[] input = new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = new int[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        HW9_15_NumberOccurrences numberOccurrences_15 = new HW9_15_NumberOccurrences();
        int[][] actualResult = numberOccurrences_15.getNumberOccurrences(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
